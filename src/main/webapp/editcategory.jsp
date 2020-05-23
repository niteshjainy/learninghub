<jsp:include page="/blocks/header.jsp" />
<jsp:include page="/blocks/body.jsp" />
<jsp:include page="/blocks/adminnavbar.jsp" />

<div class="container">
    <div class="row">
        <div style="margin-top:5%" class="panel">
            <div style="margin-top:5%;margin-bottom:5%" class="panel-body">
                <div class="col-md-3">
                    <form action="editcategory" method="post">
                         <div class="form-group">
                           <textarea class="form-control" placeholder="enter category name here.." rows ="3" name="category"></textarea>
                         </div>
                         <button type="submit" class="btn btn-block btn-warning">Submit</button>
                    </form>
               </div>
             </div>
         </div>
    </div>
</div>


<jsp:include page="/blocks/footer.jsp" />
