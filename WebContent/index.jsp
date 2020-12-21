<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 
<body> 
 <form action="rest/uye/giris" method="post">
<input type="text" name="kullaniciAdi">
 <input type="submit" value="gonder">
</form> 
</body> 
</html>
-->
<!--  http://localhost:8080/_003_RestfulAnnotation/rest/uye/giris -->
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Stacked form</h2>
  <form action="rest/uye/giris"  method="post">
    <div class="form-group">
      <label for="kullaniciAdi">Kullanici Adi:</label>
      <input type="text" class="form-control" id="kullaniciAdi" placeholder="Enter Kullanici adi" name="kullaniciAdi">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
   
    <button type="submit" class="btn btn-primary">Gonder</button>
  </form>
</div>

</body>
</html>