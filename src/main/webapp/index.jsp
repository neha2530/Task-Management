<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

                 

<meta charset="UTF-8">
<title>Login And Registration Page</title>

</head>
<body style ="background: url(img/addbook.jpg);">
  <div class="container  input-field col s12">
    <div class="row">
      <div class="col m6 offset-m3">
        <div class="card " style="box-shadow: -3px -3px 9px #aaa9a9a2, 3px 3px 7px rgba(147, 149, 151, 0.671);">
          <div class="card-content" style="box-shadow: -3px -3px 9px #aaa9a9a2, 3px 3px 7px rgba(147, 149, 151, 0.671);">
            <div class="card-action #64b5f6 blue lighten-2 cente align">
              <h3 style="margin-top:10px;text-align: center;" class="centre-align">Register</h3>
            </div>
            <p>Please fill  this form to create an account.</p>
            <div class="form">
             
              <form action="register" method= "post">
                
                <label for="name">
              
                  <b>Name</b>
                </label>
                <input type="text" placeholder="Enter Name" name="name" id="name" required>
                <br>
                 <label for="email">
                  <b>Email</b>
                </label>
                <input type="text" placeholder="Enter email" name="email" id="email" required>
                <br>
                <label for="phone-num">
                  <b>Number</b>
                </label>
                <input type="text" placeholder="Enter num" name="number" id="num" required>
                <br>
                <label for="psw">
                  <b>Password</b>
                </label>
                <input type="password" placeholder="Enter Password" name="password" id="psw" required>
                <br>
                <label for="psw-repeat">
                  <b>Repeat Password</b>
                </label>
                <input type="password" placeholder="Repeat Password" name="repeat-password" id="psw-repeat" required>
                <br>
                
                <div class="row">
                  <div class="col s12 m6 offset-m3 center-align">
                    <button type="submit" class="btn #03a9f4 light-blue z-depth-3">Register</button>
                  </div>
                </div>
                <br>
                <div class="container "> " <p>Already have an account? <a href="login.jsp">Sign in</a>. </p>
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