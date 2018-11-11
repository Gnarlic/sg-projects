<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Create DVD</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Create DVD</h1>
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
            <br>
            <br>
            <hr/>

            <div id="createdvd">
                <div>
                    <sf:form class="form-horizontal" role="form" modelAttribute="dvd"
                             method="POST" action="create">
                        <div class="container text-center">
                            <sf:errors path="*" cssClass="error" element="div"/>
                            ${errorMessage}
                        </div>
                        <div class="form-group row">
                            <label for="dvd-title" class="col-md-2 control-label">
                                Title:
                            </label>
                            <div class="col-md-4">
                                <sf:input type="text" class="form-control" id="dvd-title" name="title"
                                          path="title" placeholder="Title"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="release-year" class="col-md-2 control-label">
                                Release Year:
                            </label>
                            <div class="col-md-4">
                                <sf:input type="number" class="form-control" id="release-year"
                                          path="date"  required="required" placeholder="Year"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="director" class="col-md-2 control-label">
                                Director:
                            </label>
                            <div class="col-md-4">
                                <sf:input type="text" class="form-control" id="director" path="director" name="newDirector" placeholder="Director"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="studio" class="col-md-2 control-label">Studio:</label>
                            <div class="col-md-4">
                                <sf:input type="text" class="form-control" id="studio" path="studio" placeholder="Studio"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="user-rating" class="col-md-2 control-label">
                                User Rating:
                            </label>
                            <div class="col-md-4">
                                <sf:input type="text" class="form-control" id="user-rating" path="userRating" name="newRating" placeholder="User Rating"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="mpaa-rating" class="col-md-2 control-label">Mpaa Rating:</label>
                            <div class="col-md-4">
                                <sf:select class="form-control" path="mpaaRating" id="mpaa-rating">
                                    <sf:option value="G" selected="selected"/>
                                    <sf:option value="PG"/>
                                    <sf:option value="PG-13"/>
                                    <sf:option value="R"/>
                                    <sf:option value="NC-17"/>
                                </sf:select>
                            </div>
                        </div>
                        <div class="form-group text-center row">
                            <div class="col-md-4">
                                <button class="btn btn-default" type="submit">Submit</button>
                            </div>
                            <div class="col-md-4">
                                <a href="${pageContext.request.contextPath}/"><button class="btn btn-default" type="button">Cancel</button></a>
                            </div>
                        </div>

                    </sf:form>
                </div>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
