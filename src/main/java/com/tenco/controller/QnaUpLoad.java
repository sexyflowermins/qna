package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.QnaDAO;

@WebServlet("/qnaUpLoad")
public class QnaUpLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       QnaDAO dao;
    public QnaUpLoad() {
    	dao = new QnaDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String userEmail = request.getParameter("email");
		int a = dao.insert(title, content, userEmail);
		PrintWriter out = response.getWriter();
		if(a != 0) {
			out.print("<script>alert('질문 작성에 성공하였습니다'); location.href='index2.jsp'</script>");
		}else if (a == 0){
			out.print("<script>alert('질문 작성에 실패했습니다'); location.href='qna.jsp'</script>");
		}
	}

}
