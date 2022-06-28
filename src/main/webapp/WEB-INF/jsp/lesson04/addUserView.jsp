<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인테스트</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>



		<div class="container">
			<h1>회원 정보 추가</h1>
			
			<form  method="post" action="/lesson04/add_user">
				<div class="from-group">
					<label for= "name">이름</label>
					<input type= "text" id="name" name="name" class= "form-control col-3" placeholder="이름을 입력하셈">
				</div>
					
				<div class="from-group">
					<label for= "yyyymmdd">생년월일</label>
					<input type= "text" id="yyyymmdd" name="yyyymmdd" class= "form-control col-3" placeholder="예)20001215">
				</div>
				
				<div class="from-group">
					<label for= "email">email</label>
					<input type= "text" id="email" name="email" class= "form-control col-3" placeholder="이메일주소를 입력하셈">
				</div>
				
				<div class="from-group">
					<label for= "introduce">자기소개</label>
					<textarea  name="introduce" id="introduce" class= "form-control col-3" row="10" ></textarea>
				</div>
				
				<input type="submit" class="btn btn-success" value="회원가입">
				
			</form>
			
			
		</div>


</body>
</html>