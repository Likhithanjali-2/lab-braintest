package controller;

//import org.eclipse.jdt.internal.compiler.parser.Scanner;

import service.PersonalityCalculator;
import java.util.Scanner;

class PersonalityViewController{
	public static void main(String args[]) {
		PersonalityCalculator pc=new PersonalityCalculator();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();//"5,2,3,1,4,3,2,1,5,4,3,2,1,5,4,3,2,1,2,2";
		System.out.println(pc.findYourBrainType(input));
		sc.close();
	}
}	
/*
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/personality"})
public class PersonalityViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PersonalityViewController() {
    	PersonalityCalculator pc =new PersonalityCalculator();
    	
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering do get");
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/personalityView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PC.findYourBrainType("5,2,3,1,4,3,2,1,5,4,3,2,1,5,4,3,2,1,2,2");//findYourBrainType('');
		String options=request.getParameter("selectedOptions");
		
		System.out.println(options);
				
		/* 

		request.setAttribute("message", message);
		
		if(message!=null)
		{
			if(message.equals("rightbrained")) {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/rightBrainView.jsp");
				rd.forward(request, response);
			}
			else if(message.equals("leftbrained")) {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/leftBrainView.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/neutralView.jsp");
				rd.forward(request, response);
			}
		
		}*/


