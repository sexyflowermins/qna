package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.SoloDAO;

@WebServlet("/signup")
public class signUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SoloDAO dao;
    public signUp() {
        super();
        dao = new SoloDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		PrintWriter out = response.getWriter();
		int a = dao.insert(email,password,name,address);
		if(a != 0) {
			out.print("<script>alert('회원가입에 성공했습니다 메인화면으로 돌아갑니다'); location.href='index.jsp'</script>");
		}else if (a == 0){
			out.print("<script>alert('회원가입에 실패했습니다'); location.href='singup.jsp'</script>");
			//response.sendRedirect("tag2.jsp");
		}

	}

}
