package com.codingdojo.web.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.web.models.NumberGame;

/**
 * Servlet implementation class GameCounter
 */
@WebServlet("/GameCounter")
public class GameCounter extends HttpServlet {
	Random rand = new Random();
	int randomNum = rand.nextInt(50)+1;

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		RequestDispatcher view = request.getRequestDispatcher(("WEB-INF/Game.jsp"));
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		Random rand = new Random();
		int randomNum = rand.nextInt(100);
		String result = "";
//		System.out.println("Random Number: " + randomNum);
		
		HttpSession session = request.getSession();

		
		if(request.getSession(false) == null) {
			session.setAttribute("randomNumber", randomNum);	
			System.out.println(session.getAttribute("randomNum"));
		} else {
			int guess = Integer.parseInt(request.getParameter("guess"));
			int randomNumber = (int) session.getAttribute("randomNum");
			
			if (guess == randomNumber) {
				result = "You win!";
				session.setAttribute("randomNum", rand.nextInt(100));
			} else if(guess > randomNumber) {
				result = "Too High!";
			}else {
				result = "Too low";
			}
			request.setAttribute("result", result);

		}
		

	
		doGet(request, response);


//		RequestDispatcher view = request.getRequestDispatcher(("WEB-INF/Game.jsp"));
//		view.forward(request, response);
	
	}
	

}
