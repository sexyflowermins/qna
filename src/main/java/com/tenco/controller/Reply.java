package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.DAO.QnaDAO;
import com.tenco.DTO.QnaDTO;


@WebServlet("/reply")
public class Reply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Reply() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QnaDAO dao = new QnaDAO();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		QnaDTO result = null;
		String id = request.getParameter("id");
		String userEmail = request.getParameter("email");
		result = dao.selectReply(id, userEmail);	
		PrintWriter out = response.getWriter();
		System.out.println(result);
		if(result != null) {
			request.setAttribute("reply", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("reply.jsp");
			dispatcher.forward(request, response);
		}else {
			out.print("<script>alert('답변 확인에 실패했습니다'); location.href='replySelect.jsp'</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
