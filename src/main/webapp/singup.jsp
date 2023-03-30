<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="/Layout/header.jsp"/>
<style>
</style>
<main>
	<form action="signup" method="post">
	<label>이메일 : </label>
	<input type="email" name="email" id="email">

	<label>비밀번호 : </label>
	<input type="password" name="password" id="password">

	<label>이름 : </label>
	<input type="text" name="name" id="name">

	<label>주소 : </label>
	<input type="text" name="address" id="address">

	<button type="submit">회원가입</button>
	</form>
			
</main>


<jsp:include page="/Layout/footer.jsp"/>
