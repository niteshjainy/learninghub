<!doctype html>
<html>
<head>
    <title>Spring Boot AJAX jQuery CRUD</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <!-- jQuery Modal -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
    <style>
		.modal p { margin: 1em 0; }

		.add_form.modal {
		  border-radius: 0;
		  line-height: 18px;
		  padding: 0;
		  font-family: "Lucida Grande", Verdana, sans-serif;
		}

		.add_form.modal p { padding: 20px 30px; border-bottom: 1px solid #ddd; margin: 0;
		  background: -webkit-gradient(linear,left bottom,left top,color-stop(0, #eee),color-stop(1, #fff));
		  overflow: hidden;
		}
		.add_form.modal p:last-child { border: none; }
		.add_form.modal p label { float: left; font-weight: bold; color: #333; font-size: 13px; width: 110px; line-height: 22px; }
		.add_form.modal p input[type="text"],
		.add_form.modal p input[type="submit"]		{
		  font: normal 12px/18px "Lucida Grande", Verdana;
		  padding: 3px;
		  border: 1px solid #ddd;
		  width: 200px;
		}

		#msg {
		  margin: 10px;
		  padding: 30px;
		  color: #fff;
		  font-size: 18px;
		  font-weight: bold;
		  background: -moz-linear-gradient(top, #2e5764, #1e3d47);
		  background: -webkit-gradient(linear,left bottom,left top,color-stop(0, #1e3d47),color-stop(1, #2e5764));
		}
	</style>
    <script type="text/javascript">
		$(document).ready(function() {
			$.getJSON('http://localhost:8080/getallusers', function(json) {
				var tr=[];
				for (var i = 0; i < json.length; i++) {
					tr.push('<tr>');
					tr.push('<td>' + json[i].userId + '</td>');
					tr.push('<td>' + json[i].userFirstName + '</td>');
					tr.push('<td>' + json[i].userLastName+ '</td>');
					tr.push('<td>' + json[i].userEmail + '</td>');
					tr.push('<td>' + json[i].userContact + '</td>');
					tr.push('<td>' + json[i].userState + '</td>');
					tr.push('<td>' + json[i].userDegree + '</td>');

					tr.push('<button class=\'delete\' id=' + json[i].userId + '>Delete</button></td>');
					tr.push('</tr>');
				}
				$('table').append($(tr.join('')));
			});






			$(document).delegate('.delete', 'click', function() {
				if (confirm('Do you really want to delete record?')) {
					var id = $(this).attr('id');
					var parent = $(this).parent().parent();
					$.ajax({
						type: "DELETE",
						url: "/deleteuser/" + id,
						cache: false,
						success: function() {
							parent.fadeOut('slow', function() {
								$(this).remove();
							});
							location.reload(true)
						},
						error: function() {
							$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error deleting record').fadeIn().fadeOut(4000, function() {
								$(this).remove();
							});
						}
					});
				}
			});


	</script>
</head>
<body>


<table border="1" cellspacing="0" cellpadding="5">
    <tr>
        <th>Id</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>PHONE</th>
        <th>State</th>
        <th>Degree</th>
        <th>action</th>
    </tr>
</table>



</body>
</html>