<%-- 
    Document   : formInsert
    Created on : Jun 19, 2017, 5:27:24 AM
    Author     : dickajava
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrapValidator.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrapValidator.min.css"/>" rel="stylesheet">

        <script src="<c:url value="/resources/js/jQuery.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery-1.10.2.min.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrapValidator.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrapValidator.min.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="page-header">
                        <h3>${msg}</h3>
                    </div>
                   <form class="form-horizontal" action="${pageContext.request.contextPath}/insert" method="POST">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">nama :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="nama" placeholder="nama">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">alamat :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="alamat" placeholder="alamat">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">telepon :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="notelp" placeholder="notelp">
                            </div>
                        </div>
                        <div class="col-lg-4 col-lg-offset-4">
                            <button type="submit" class="btn btn-success">
                                <span class="glyphicon glyphicon-save"></span>
                                save
                            </button>
                            <a href="${pageContext.request.contextPath}/index" class="btn btn-default">
                                <span class="glyphicon glyphicon-circle-arrow-right"></span>
                                kembali
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
