package com.dao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.czi.bean.Car;
import com.czi.dao.CarDAO;


@WebServlet("/CZIController")
public class CZIController extends HttpServlet{

	CarDAO dao = new CarDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String requestForm = request.getParameter("czi_button");
		
		if(requestForm.equals("Insert Car")) {
			String CarNo = request.getParameter("CarNo");
			String Manufacture = request.getParameter("Manufacture");
			String Model = request.getParameter("Model");
			int KmsRan =Integer.parseInt(request.getParameter("KmsRan"));
			int PriceExpected =Integer.parseInt(request.getParameter("PriceExpected"));
			int NoOfOwners =Integer.parseInt(request.getParameter("NoOfOwners"));
			Car bean = new Car(CarNo,Manufacture,Model,KmsRan,PriceExpected,NoOfOwners);
			
			
			int n = dao.insertCar(bean);
			
			if (n==1) {
				response.sendRedirect("InsertCarSuccess.jsp");
			}

		}
	}
}
