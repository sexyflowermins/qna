<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/Layout/headerReply.jsp"/>

<main>
	<form action="reply" method="get">
	<label>질문 제목 : </label>
	<input type="text" name="title" id="title">

	<label>이메일 확인: </label>
	<input type="email" name="email" id="email">
	<button type="submit">답변 확인 하기</button>
	</form>
</main>

<jsp:include page="/Layout/footer.jsp"/>
