/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryspringmvc.dao;

import com.sg.dvdlibraryspringmvc.model.Dvd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

/**
 *
 * @author Elnic
 */
public class DvdLibraryDaoDbImpl implements DvdLibraryDao {

    private JdbcTemplate jdbc;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbc = jdbcTemplate;
    }

    private static final String SQL_ADD_DVD = "insert into dvd"
            + "(DvdTitle, DvdReleaseYear, DirectorName, StudioName, UserRating, MpaaRating)"
            + "Values (?,?,?,?,?,?)";

    private static final String SQL_REMOVE_DVD = "delete from dvd where DvdId = ?";

    private static final String SQL_GET_DVD = "select * from dvd where DvdId = ?";

    private static final String SQL_GET_ALL_DVDS = "select * from dvd";

    private static final String SQL_EDIT_DVD = "update dvd set "
            + "DvdTitle = ?, DirectorName = ?, DvdReleaseYear = ?, StudioName = ?, UserRating = ?, MpaaRating = ?"
            + " where DvdId = ?";

    private static final String SQL_GET_DVDS_WITH = "select * from dvd where DvdTitle like '%" + "?" + "%'";

    private static final String SQL_GET_DVDS_IN_YEAR = "select * from dvd where DvdReleaseYear = ?";

    private static final String SQL_GET_DVDS_WITH_DIRECTOR = "select * from dvd where DirectorName like '%'?'%'";

    private static final String SQL_GET_DVDS_WITH_RATING = "select * from dvd where MpaaRating = ?";

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Dvd addDvd(Dvd dvd) throws DvdLibraryDaoException, SQLException {
        jdbc.update(SQL_ADD_DVD,
                dvd.getTitle(),
                dvd.getDate(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getUserRating(),
                dvd.getMpaaRating());

        int dvdId
                = jdbc.queryForObject("select LAST_INSERT_ID()", Integer.class);

        dvd.setDvdId(dvdId);

        return dvd;

    }

    @Override
    public List<Dvd> getAllDvds() throws DvdLibraryDaoException, SQLException {
        return jdbc.query(SQL_GET_ALL_DVDS, new DvdMapper());
    }

    @Override
    public void removeDvd(int dvdId) throws DvdLibraryDaoException, SQLException {
        jdbc.update(SQL_REMOVE_DVD, dvdId);
    }

    @Override
    public void editDvd(Dvd dvd) throws DvdLibraryDaoException, SQLException {
        jdbc.update(SQL_EDIT_DVD,
                dvd.getTitle(),
                dvd.getDirector(),
                dvd.getDate(),
                dvd.getStudio(),
                dvd.getUserRating(),
                dvd.getMpaaRating(),
                dvd.getDvdId());
    }

    @Override
    public List<Dvd> getMoviesByTitle(String title) throws DvdLibraryDaoException, SQLException {
        return jdbc.query("select * from dvd where DvdTitle like '%" + title + "%'", new DvdMapper());
    }

    @Override
    public List<Dvd> getMoviesByYear(String year) throws DvdLibraryDaoException, SQLException {
        return jdbc.query(SQL_GET_DVDS_IN_YEAR, new DvdMapper(), year);
    }

    @Override
    public List<Dvd> getMoviesByDirector(String director) throws DvdLibraryDaoException, SQLException {
        return jdbc.query("select * from dvd where DirectorName like '%" + director + "%'", new DvdMapper());
    }

    @Override
    public List<Dvd> getMoviesWithRating(String rating) throws DvdLibraryDaoException, SQLException {
        return jdbc.query(SQL_GET_DVDS_WITH_RATING, new DvdMapper(), rating);
    }

    @Override
    public Dvd getDvd(int dvdId) throws DvdLibraryDaoException, SQLException {
        try {
            Dvd dvd = jdbc.queryForObject(SQL_GET_DVD, new DvdMapper(), dvdId);
            return dvd;
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<Dvd> getMovies(Model model, String string) throws DvdLibraryDaoException, SQLException {
        model.addAttribute("errorMessage", "booyah");
        return getMoviesByDirector("george");
    }

    private static final class DvdMapper implements RowMapper<Dvd> {

        @Override
        public Dvd mapRow(ResultSet rs, int i) throws SQLException {
            Dvd dvd = new Dvd();
            dvd.setDvdId(rs.getInt("DvdId"));
            dvd.setTitle(rs.getString("DvdTitle"));
            dvd.setDate(rs.getInt("DvdReleaseYear"));
            dvd.setDirector(rs.getString("DirectorName"));
            dvd.setStudio(rs.getString("StudioName"));
            dvd.setUserRating(rs.getString("UserRating"));
            dvd.setMpaaRating(rs.getString("MpaaRating"));
            return dvd;
        }
    }

}
