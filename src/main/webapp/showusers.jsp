<jsp:include page="/blocks/header.jsp" />
<script>
$("#status").show();
setTimeout(function() { $("#status").hide(); }, 2000);
</script>
<jsp:include page="/blocks/body.jsp" />
<jsp:include page="/blocks/adminnavbar.jsp" />
 <div style="margin-top:5%;" class="col-md-8">
            <div class="panel">
                <div style="margin-top:5%;margin-bottom:5%" class="panel-body">
                    <div class="col-md-12">
        	          <table class="table table-hover ">
							  <thead>
							    <tr>
							      <th scope="col">UserID</th>
							      <th scope="col">FirstName</th>
							      <th scope="col">LastName</th>
							      <th scope="col">Email</th>
							      <th scope="col">Contact</th>
							      <th scope ="col">State</th>
							      <th scope ="col">Degree</th>
							      <th scope = "col">Delete</th>
							    </tr>
							  </thead>
							  <tbody id = "show">
                              </tbody>
					</table>
            </div>
        </div>
        </div>
        </div>



<script src="/js/user.js"></script>
<jsp:include page="/blocks/footer.jsp" />
