<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Dvd Library</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">        
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">DVD Library</h1>
            <br/>
            <div class="row">
                <div class="col-md-2">
                    <a href="${pageContext.request.contextPath}/"><button type="button" class="btn btn-default">Home</button></a>
                </div>
                <div class="col-md-2">
                    <a href="${pageContext.request.contextPath}/createdvdpage"><button type="button" class="btn btn-default">Create DVD</button></a>
                </div>
                <div class="col-md-8">
                    <form class="row form-group" action="${pageContext.request.contextPath}/searchDvds" method="GET">
                        <div class="col-md-3">
                            <button class="btn btn-default" type="submit">Search</button>
                        </div>
                        <div class="col-md-3">
                            <select required class="custom-select custom-select-md" id="searchCategory" name="searchCategory">
                                <option value="" disabled selected hidden>Select Category</option>
                                <option value="Title">Title</option>
                                <option value="ReleaseYear">Release Year</option>
                                <option value="DirectorName">Director Name</option>
                                <option value="Rating">Rating</option>
                            </select>
                        </div>
                        <div class="col-md-6">
                            <input type="text" id="searchTerm"  name="searchTerm" class="form-control" placeholder="Search Term" required="required">
                        </div>
                    </form>
                </div>
            </div>
            <div id="dvdtable">
                <table id="dvdTable" class="table table-hover">
                    <tr>
                        <th>Title</th>
                        <th>Release Date</th>
                        <th>Director</th>
                        <th>Mpaa Rating</th>
                        <th>Studio</th>
                        <th>User Rating</th>
                        <th></th>
                    </tr>
                    <c:forEach var="currentDvd" items="${dvdList}">
                        <tr>
                            <td><c:out value="${currentDvd.title}"/></td>
                            <td><c:out value="${currentDvd.date}"/></td>
                            <td><c:out value="${currentDvd.director}"/></td>
                            <td><c:out value="${currentDvd.mpaaRating}"/></td>
                            <td><c:out value="${currentDvd.studio}"/></td>
                            <td><c:out value="${currentDvd.userRating}"/></td>
                            <td><a href="${pageContext.request.contextPath}/delete?dvdId=${currentDvd.dvdId}" onClick="return confirm('Are you sure you want to delete?');">Delete</a> |
                                <a href="${pageContext.request.contextPath}/editPage?dvdId=${currentDvd.dvdId}">Edit</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

