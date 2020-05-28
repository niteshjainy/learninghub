<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>
<style type="text/css">

.grow{
transition: 1s ease;
text-align:center;
font-weight:700;
font-size:130%;
font-family:Helvetica, Arial, Sans-Serif;

}

.grow :hover{
-webkit-transform: scale(1.2);
-ms-transform: scale(1.2);
transform: scale(1.2);
transition: 1s ease;
}

.inner {
background-color : #E6E6FA;
}

.inner:hover {
background-color : #F8F8FA;

}
</style>
</head>
<div class="container" style="margin-top:3%">
    <c:forEach var = "result" items = "${category}">
        <div class="col-md-4 col-md-offset-1 grow">
            <div class="panel inner">
              <div class="panel-body"><c:out value = "${result.subjectCategory}"/></div>
            </div>
        </div>
    </c:forEach>
</div>
