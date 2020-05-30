<jsp:include page="/blocks/header.jsp" />
    <Script>

    </Script>
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
            <form action="addquestion" method="post">
                <div class="form-group">
                    <input type="hidden" value ="1" class="form-control" name="id" id="id">
                </div>
                 <div class="form-group">
                   <select class="form-control" id="selectcategory" name="subjectCategory">
                   <option value="" disabled selected>select Category</option>
                   </select>
                 </div>
                 <div class="form-group">
                   <input type="text" class="form-control" placeholder="enter question here.."  id="question" name="question"/>
                 </div>
                 <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 1" name="firstOption" id="firstOption"/>
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" placeholder="option 2" name="secondOption" id="secondOption"/>
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 3" name="thirdOption" id="thirdOption"/>
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="option 4" name="fourthOption" id="fourthOption"/>
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" placeholder="answer" name="answer" id="answer"/>
                  </div>
                 <button type="submit" class="btn btn-block btn-warning">Submit</button>
            </form>
        </div>
    </div>
</div>


<script src="/js/handlequestion.js"></script>
<script src="/js/handlecategory.js"></script>
<jsp:include page="/blocks/footer.jsp" />
