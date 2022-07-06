<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인테스트</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script> 

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>



		<div class="container">
			<h1>회원 정보 추가</h1>
			
			<form  method="post" action="/lesson06/add_user">
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
				
				<input type="button" class="btn btn-success" value="회원가입" id="addBtn"> 
				
			</form>
			
			
		</div>

<script>
$(document).ready(function(){
	//1. Jquery의 submit 기능 이용하기
	/* $('form').on('submit',function(e){
		e.preventDefault();  //submit 되는것을 막음
		
		//alert("추가버튼 완료");
		
		//validation
		let name =	$('#name').val().trim();
		//alert(name);
		if(name == ""){
			alert("이름을 입력하셈");
			return false;
		}
		
		let yyyymmdd = $('#yyyymmdd').val().trim();
		if (yyyymmdd ==""){
			
			alert("생일을 입력하셈");
			return false;
		}
		
		//여기까지 도달하면 submit
	}); */
	
	//2. jquery의 ajax 통신을 이용하기
	$('#addBtn').on('click',function(){
		//alert("aaaa");
		let name =	$('#name').val().trim();
		//alert(name);
		if(name == ""){
			alert("이름을 입력하셈");
			return false;
		}
		
		let yyyymmdd = $('#yyyymmdd').val().trim();
		if (yyyymmdd ==""){
			
			alert("생일을 입력하셈");
			return false;
		}
		//모두 숫자인지 
		if (isNaN(yyyymmdd)){
			alert("숫자만 입력해주세요");
			return;
		}
		
			let email = $('#email').val().trim();
			let introduce = $('textarea[name=introduce]').val();
			
			/* alert(email);
			alert(introduce); */
			
				//AJAX: 폼태그하고 상관없이 비동기로 별도 요청(request)
			$.ajax({
				//request
				type:"POST"		//Request Method
				, url:"/lesson06/add_user"	//Action URL
				, data:{"name":name, "yyyymmdd":yyyymmdd, "email":email, "introduce":introduce}  //키 ,변수이름
				
				//response
				,success: function(data){
					alert(data);
				}
				, complete: function(data){
					alert("완료");
				}
				, error: function(e){
					alert("error:"+ e);
				}
				
				
			});
	});
	
		
});

</script>

</body>
</html>