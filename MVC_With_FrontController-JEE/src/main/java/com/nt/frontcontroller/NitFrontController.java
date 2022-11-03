package com.nt.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.controller.Linkhandler;

@WebServlet(value = "/")
public class NitFrontController extends HttpServlet {
	
	private Linkhandler handler;
	
	@Override
	public void init() throws ServletException {
		handler=new Linkhandler();
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet(-,-)"+req.getServletPath());
		
		//navigation mgmt===============
		String lvn=null;
		if(req.getServletPath().equalsIgnoreCase("/wish"))
			lvn=handler.showWishMsg(req);
		else if(req.getServletPath().equalsIgnoreCase("/lang"))
			lvn=handler.showAllLanguage(req);
		else
			lvn="index";
		
		
		//view mgmt=====================
		String destPage=null;
		if(lvn.equalsIgnoreCase("wish_msg"))
			destPage="/show_Wish.jsp";
		else if(lvn.equalsIgnoreCase("all_lang"))
			destPage="/show_Lang.jsp";
		else
			destPage="/index.jsp";
		
		
		//data mgmt=====================
		RequestDispatcher rd=req.getRequestDispatcher(destPage);
		rd.forward(req, res);
			
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
