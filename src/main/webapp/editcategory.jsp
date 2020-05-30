<jsp:include page="/blocks/header.jsp" />
<script>
$("#status").show();
setTimeout(function() { $("#status").hide(); }, 2000);
</script>
<jsp:include page="/blocks/body.jsp" />
<jsp:include page="/blocks/adminnavbar.jsp" />

<div class="container">
    <div class="row">
        <div style="margin-top:5%;" class="col-md-4">
            <div style="margin-top:5%;width:300px" class="panel">
                <div style="margin-top:5%;margin-bottom:5%" class="panel-body">
                    <div class="col-md-12">
                    <h4 id=status style="text-align:center;background-color:#ffebcd"> ${msg}</h4>
                         <div class="form-group">
                           <textarea class="form-control" placeholder="enter category name here.." row="3" id="subjectCategory"></textarea>
                         </div>
                         <button id="update" class="btn btn-block btn-warning">Submit</button>
                   </div>
                 </div>
             </div>
        </div>
        <jsp:include page="adminshowcategory.jsp" />
    </div>
</div>

<script src="/js/handlecategory.js"></script>
<jsp:include page="/blocks/footer.jsp" />
