
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
    <body >
    <jsp:include page="adminnavbar.jsp" />
        <div class="container">
            <div class="row " style="margin-top: 25px">

                  	<table class="table table-hover table-bordered table-sm table-dark">
							  <thead>
							    <tr>
							      <th scope="col">Feedback Id</th>
							      <th scope="col">How was the frequency of training classes</th>
							      <th scope="col">What recommendation do you have to improve this program in future:</th>
							      <th scope="col">What did you enjoy most about this training program</th>
							      <th scope="col">Full Name</th>
							    </tr>
							  </thead>
							  <tbody>
                                  <c:forEach var = "result" items = "${feedbacks}">
						          <tr>
                                      <td><c:out value = "${result.feedbackId}"/></td>
                                      <td><c:out value = "${result.firstAnswer}"/></td>
                                      <td><c:out value = "${result.secondAnswer}"/></td>
                                      <td><c:out value = "${result.thirdAnswer}"/></td>
                                      <td><c:out value = "${result.user.firstName}" + "${result.user.lastName}"/></td>
						          </tr>
							  </tbody>
						</table>
                </div>
            </div>
    </body>
</html>