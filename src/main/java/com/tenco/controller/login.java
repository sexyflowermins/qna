package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DTO.SoloDTO;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SoloController controller;
    public login() {
        super();
        controller = new SoloController();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		SoloDTO dto = controller.requesetSingIn(id, password);
		if(id.equals("kim@naver.com") && password.equals("alsdn1004")){
			out.print("<script>alert('관리자님 반갑습니다 '); location.href='"
							+ "indexManager.jsp'</script>");
		}else if(dto != null) {
			out.print("<script>alert('로그인 성공했습니다 매인화면으로 "
					+ "돌아갑니다'); location.href='index2.jsp'</script>");
		}else if (dto == null){
			out.print("<script>alert('로그인 실패했습니다'); location.href='login.jsp'</script>");
		}
	}

}
