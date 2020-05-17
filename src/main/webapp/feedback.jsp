<!DOCTYPE html>
<html lang="en">
    <head>
      <title>Bootstrap Example</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="form.css" >

    </head>
    <body>
        <div class="imagebg">ff</div>
        <jsp:include page="homenavbar.jsp" />
        <div class="container">
            <div class="row " style="margin-top: 30px">
            <div class="col-md-8 col-md-offset-2 form-container">
                    <h4 style="text-align:center"> Please provide your feedback here </h4>
                       <hr>
                    <form role="form" method="POST" Action="addFeedback">
                      <div class="row">
                            <div class="col-sm-12 form-group">
                                <label for="comments"> How was the frequency of training classes:</label>
                                <textarea required class="form-control" name="firstAnswer" placeholder="Your Comments" rows="2"></textarea>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12 form-group">
                                <label for="comments"> What recommendation do you have to improve this program in future:</label>
                                <textarea required class="form-control"  name="secondAnswer" placeholder="Your Comments" rows="2"></textarea>
                            </div>
                        </div>
                         <div class="row">
                            <div class="col-sm-12 form-group">
                                <label for="comments"> What did you enjoy most about this training program:</label>
                                <textarea required class="form-control" name="thirdAnswer" placeholder="Your Comments" rows="2"></textarea>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12 form-group">
                                <button type="submit" class="btn btn-lg btn-info btn-block" >Submit </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
