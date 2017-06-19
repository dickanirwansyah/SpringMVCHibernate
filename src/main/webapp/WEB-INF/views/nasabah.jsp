<%-- 
    Document   : nasabah
    Created on : Jun 18, 2017, 12:05:35 PM
    Author     : dickajava
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>${title}</title>
        <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/dataTables.bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
        
        <script src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery-1.10.2.min.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery.dataTables.js"/>"></script>
        <script src="<c:url value="/resources/js/dataTables.bootstrap.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrap-datepicker.js"/>"></script>
        <script src="<c:url value="/resources/js/moment.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
        
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="page-header">
                    <h3>${msg}</h3>
                </div>
                <a href="${pageContext.request.contextPath}/insert" class="btn btn-success">
                    <span class="glyphicon glyphicon-plus-sign"></span>
                    Tambah Data
                </a>
                <div class="page-header">
                    <table class="table table-bordered table-condensed" id="myTabel">
                        <thead>
                            <tr>
                                <th>idnasabah</th>
                                <th>nama</th>
                                <th>alamat</th>
                                <th>notelp</th>
                                <th>opsi</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${nasabahlist}" var="nasabah">
                                <tr>
                                    <td><c:out value="${nasabah.idnasabah}"/></td>
                                    <td><c:out value="${nasabah.nama}"/></td>
                                    <td><c:out value="${nasabah.alamat}"/></td>
                                    <td><c:out value="${nasabah.notelp}"/></td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/update?idnasabah=${nasabah.idnasabah}" class="btn btn-success">
                                            <span class="glyphicon glyphicon-pencil"></span>
                                            Edit
                                        </a>
                                        <a href="${pageContext.request.contextPath}/delete?idnasabah=${nasabah.idnasabah}" 
                                           onclick="return confirm('really?')" class="btn btn-default">
                                            <span class="glyphicon glyphicon-trash"></span>
                                            Hapus
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
