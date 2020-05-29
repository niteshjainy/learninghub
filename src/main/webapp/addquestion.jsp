<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="/blocks/header.jsp" />
<jsp:include page="/blocks/body.jsp" />
<jsp:include page="/blocks/adminnavbar.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
        <h3 style="background-color:#ffa07a;text-align:center;padding:1%"> Add new question from here....</h3>
            <form action="/addquestion" method="post">
                 <div class="form-group">
                   <select class="form-control" name="category">
                   <c:forEach var = "result" items = "${category}">
                   <option value="${result.id}"><c:out value = "${result.subjectCategory}"/></option>
                   </c:forEach>
                   </select>
                 </div>
                 <div class="form-group">
                   <input type="text" class="form-control" placeholder="enter question here.."  name="question">
                 </div>
                 <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 1" name="firstOption">
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" placeholder="option 2" name="secondOption">
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 3" name="thirdOption">
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 4" name="fourthOption">
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="answer" name="answer">
                  </div>
                 <button type="submit" class="btn btn-block btn-warning">Submit</button>
            </form>
        </div>
    </div>
</div>


<jsp:include page="/blocks/footer.jsp" />
