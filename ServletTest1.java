package com.simplilearn.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest1
 */
@WebServlet("/ServletTest1")
public class ServletTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String name = null;

	//Define dataSource/connection pool for reference
	
	@Resource(name="jdbc/sb012")
	private DataSource dataSource;
	
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Set the PrintWriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// establish connection to the DB
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			myConn = dataSource.getConnection();
		//create a sequel statement
		String sql = "select * from students";
		myStmt = myConn.createStatement();
		
		
		//execute the Sequel statement
		myRs = myStmt.executeQuery(sql);
		
		//process the ResultSet
		while(myRs.next()) {
			String fname = myRs.getString("fname");
			out.println(fname);
			
		}
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}

public static String getName() {
		return name;
	}

}