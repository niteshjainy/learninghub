    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand">Learninghub</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav">
            <li class=""><a href="#">Home</a></li>
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" href="#">User Management <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">All Users list</a></li>
                <li><a href="#">deleted User List</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" href="#">Question Management <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="addcategory.jsp">Add or delete Category</a></li>
                <li><a href="editcategory.jsp">edit or delete Category</a></li>
                <li><a href="addquestion.jsp">Add new questions</a></li>
                <li><a href="editquestion.jsp">edit questions</a></li>
                <li><a href="#">search questions</a></li>
              </ul>
            </li>
            <li><a href="http://localhost:8080/getAllFeedbacks">Show all Feedbacks</a></li>
            <li><a href="#">show tables</a></li>

          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
          </ul>
        </div>
      </div>
    </nav>
