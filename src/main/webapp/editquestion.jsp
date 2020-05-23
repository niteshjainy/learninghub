<jsp:include page="/blocks/header.jsp" />
<jsp:include page="/blocks/body.jsp" />
<jsp:include page="/blocks/adminnavbar.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
        <div style="background-color:#ffa07a;">
            <form action="findQuestion" method="get">
                 <div class="form-group col-md-3 col-md-offset-3">
                    <input type="text" class="form-control" placeholder="Id" name="questionId"></text>
                 </div>
                 <div class="form-group col-md-3 ">
                    <button type="submit" class="btn btn-block btn-warning">Find</button>
                  </div>
            </form>
        </div>
            <form action="addQuestion" method="post">
                 <div class="form-group">
                   <select class="form-control" name="select">
                   <option>Select</option>
                   <option>Java</option>
                   <option>Python</option>
                   <option>Php</option>
                   <option>Java Script</option></select>
                 </div>
                 <div class="form-group">
                   <textarea class="form-control" placeholder="enter question here.." row="3" name="question"></textarea>
                 </div>
                 <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 1" name="firstOption"></text>
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" placeholder="option 2" name="secondOption"></text>
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 3" name="thirdOption"></text>
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 4" name="fourthOption"></text>
                  </div>
                 <button type="submit" class="btn btn-block btn-warning">Submit</button>
            </form>
        </div>
    </div>
</div>


<jsp:include page="/blocks/footer.jsp" />
