package com.tenco.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.QnaDAO;

/**
 * Servlet implementation class Reply
 */
@WebServlet("/reply")
public class Reply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Reply() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QnaDAO dao = new QnaDAO();
		String title = request.getParameter("title");
		String userEmail = request.getParameter("email");
		request.setAttribute("reply", dao.selectReply(title, userEmail));
		RequestDispatcher dispatcher = request.getRequestDispatcher("reply.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
