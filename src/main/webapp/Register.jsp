<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href ="css/bootstrap.css">
<style>          
body {
  font-family: 'Nunito', sans-serif;
  color: #384047;
}
form {
  max-width: 500px;
  margin: 10px auto;
  padding: 10px 20px;
  background: #f4f7f8;
  border-radius: 8px;
}
input[type="text"]{
  background: rgba(255,255,255,0.1);
  border: none;
  font-size: 16px;
  height: auto;
  margin: 0;
  outline: 0;
  padding: 15px;
  width: 90%;
  background-color: #e8eeef;
  color: #8a97a0;
  box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
  margin-bottom: 30px;
}
button {
  padding: 10px 39px 10px 39px;
  color: #FFF;
  background-color: #4bc970;
  font-size: 18px;
  text-align: center;
  font-style: normal;
  border-radius: 5px;
  width: 100%;
  border: 1px solid #3ac162;
  border-width: 1px 1px 3px;
  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
}
label {
  display: block;

}
div{
	width:60%;
}
</style>

</head>
<body>
<div>
<form action="CZIController" method ="post">
          <label>CarNo:</label>
          <input type="text" name="CarNo" >
          
          <label>Manufacture:</label>
          <input type="text" name="Manufacture" >
       	 
          <label>Model:</label>
          <input type="text" name="Model" >
       
          <label>KmsRan:</label>
          <input type="text" name="KmsRan" >
            
          <label>PriceExpected:</label>
          <input type="text" name="PriceExpected" >
         
          <label>NoOfOwners:</label>
          <input type="text" name="NoOfOwners">
        
              <button type="submit" value ="Insert Car" name="czi_button">Register
                </button>
</form>
</div>
</body>
</html>