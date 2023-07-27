<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>



<meta charset="UTF-8">
<title>Create A New Task</title>

</head>
<body style="background: url(img/addbook.jpg);">

	<div class="container  input-field col s12">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card "
					style="box-shadow: -3px -3px 9px #aaa9a9a2, 3px 3px 7px rgba(147, 149, 151, 0.671);">
					<div class="card-content"
						style="box-shadow: -3px -3px 9px #aaa9a9a2, 3px 3px 7px rgba(147, 149, 151, 0.671);">
						<div class="card-action #64b5f6 blue lighten-2 cente align">
							<h3 style="margin-top: 10px; text-align: center;"
								class="centre-align">Edit Your Task</h3>
						</div>
						
						

						<div class="form">

							<form action="edit">
							
								 <input type="text" hidden name="id" value=<%= request.getParameter("id") %>
									id="id" > 

								<label for="title"> <b>Title</b>
								</label> <input type="text"  placeholder="Enter title"  value=<%= request.getParameter("title") %> name="title"
									id="title" required> <br> <label for="description">
									<b>Description</b>
								</label> <input type="text" placeholder="Enter description"
									name="description" value=<%= request.getParameter("description") %> id="description" required> <br>
								<div class="row">
									<div class="col s12 m6 offset-m3 center-align">
										<button type="submit" class="btn #03a9f4 light-blue z-depth-3">done</button>
									</div>
								</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</form>
</body>
</html>