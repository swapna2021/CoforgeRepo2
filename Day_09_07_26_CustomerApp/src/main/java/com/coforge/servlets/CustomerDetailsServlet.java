package com.coforge.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.coforge.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerDetailsServlet
 */
@WebServlet("/CustomerDetailsServlet")
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerDetailsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer(101, "Rahul Sharma", "Hyderabad"));

		customerList.add(new Customer(102, "Priya Reddy", "Bengaluru"));

		customerList.add(new Customer(103, "Amit Verma", "Chennai"));

		customerList.add(new Customer(104, "Sneha Patil", "Mumbai"));

		customerList.add(new Customer(105, "Kiran Kumar", "Pune"));

		customerList.add(new Customer(106, "Anjali Singh", "Delhi"));

		customerList.add(new Customer(107, "Vikram Rao", "Visakhapatnam"));

		customerList.add(new Customer(108, "Meena Joshi", "Kolkata"));

		customerList.add(new Customer(109, "Arjun Nair", "Kochi"));

		customerList.add(new Customer(110, "Pooja Mehta", "Ahmedabad"));
		
		request.setAttribute("customerList", customerList);
		
		RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
		
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
