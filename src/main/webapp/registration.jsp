
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="registration.css">

</head>
<body>
<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from giving your first quiz</p>
                        <a href="index.jsp" style="text-decoration:none"><button class="btn btn-block btn-md btn-primary"> Login</button></a>
                        <br/>
                    </div>
                    <div class="col-md-9 register-right">
                        <form action="/registration" modelAttribute="user" method="post">
                                <h3 class="register-heading">Fill the form to begin your journey</h3>
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="userFirstName" id="userFirstName" class="form-control" placeholder="First Name *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="userLastName" id="userLastName" class="form-control" placeholder="Last Name *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" id="userPassword" name="userPassword" class="form-control" placeholder="Password *" value="" />
                                        </div>
                                        <div class="form-group">
                                             <input type="email" id="userEmail" name="userEmail" class="form-control" placeholder="Your Email *" value="" />
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text"  id="userContact" name="userContact" class="form-control" placeholder="Your Phone *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="userState" id="userState" class="form-control" placeholder="Your state *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="userDob" name="userDob" placeholder="Your date of birth *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="userDegree" name="userDegree" placeholder="What r u studying now *" value="" />
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-block btn-info"> Register </button>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
            </div>
    </body>
</html>