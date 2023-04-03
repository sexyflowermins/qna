
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Date"%>



<jsp:include page="/Layout/header.jsp" />
<style>
main {
	background: #E6DADA;
	background: -webkit-linear-gradient(to left, #274046, #E6DADA);
	background: linear-gradient(to left, #274046, #E6DADA);
	display: flex;
	padding: 20px;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	width: 100%;
	height: 600px
}
form {
	background: #E8E9EE;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	border-radius: 20px;
	width: 300px;
	height: 300px;
}
</style>
<main>
	<form action="login" method="post">
		<label>이메일 : </label> 
		<input type="email" name="id" id="id"> 
		<label>비밀번호: </label> 
		<input type="password" name="password" id="password">

		<button type="submit">로그인</button>
	</form>
</main>

<jsp:include page="/Layout/footer.jsp" />

