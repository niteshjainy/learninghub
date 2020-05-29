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
							      <th scope="col">UserID</th>
							      <th scope="col">FirstName</th>
							      <th scope="col">LastName</th>
							      <th scope="col">Email</th>
							      <th scope="col">Contact</th>
							      <th scope ="col">State</th>
							      <th scope ="col">Degree</th>
							      <th scope = "col">action</th>
							    </tr>
							  </thead>
							  <tbody>
                                  <c:forEach var = "result" items = "${users}">
                                  <tr>
                                      <td><c:out value = "${result.userId}"/></td>
                                      <td><c:out value = "${result.userFirstName}"/></td>
                                      <td><c:out value = "${result.userLastName}"/></td>
                                      <td><c:out value = "${result.userEmail}"/></td>
                                      <td><c:out value = "${result.userContact} "/></td>
                                       <td><c:out value = "${result.userState} "/></td>
                                        <td><c:out value = "${result.userDegree} "/></td>
                                        <td> <button type="button" class="btn btn-danger">X</button>
                                        </td>


						          </tr>
						          </c:forEach>
							  </tbody>
					</table>
            </div>
        </div>
        <script src ="js/user.js">
    <jsp:include page="/blocks/footer.jsp" />