<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <jsp:include page="/blocks/header.jsp" />
  <style type="text/css">

.table-container
{
	background-color: #fff;
    box-shadow: 0 16px 24px 2px rgba(0,0,0,0.14), 0 20px 30px 5px rgba(0,0,0,0.12), 0 8px 10px -5px rgba(0,0,0,0.3);
    border-radius: 8px;
    font-family: 'Montserrat', Arial, Helvetica, sans-serif;
}
</style>
  <jsp:include page="/blocks/body.jsp" />
    <jsp:include page="/blocks/adminnavbar.jsp" />
        <div class="container">
            <div class="row " style="margin-top: 25px">
        	<table class="table table-container table-bordered table-sm table-dark">
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
                                      <td><c:out value = "${result.user.userFirstName} ${result.user.userLastName} "/></td>
						          </tr>
						          </c:forEach>
							  </tbody>
					</table>
            </div>
        </div>
    <jsp:include page="/blocks/footer.jsp" />