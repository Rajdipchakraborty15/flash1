package raju;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String get_n=request.getParameter("id");  
		String get_p=request.getParameter("description");  
		String get_e=request.getParameter("likes");  
		String get_c=request.getParameter("url");
		String get_d=request.getParameter("by");
		
	out.println("<h1>Your youtube data<h1>" );
	out.println(get_n );
	out.println(get_p );
	out.println(get_e );
	out.println(get_c );
	out.println(get_d );	
		
	
	 //Getset gs=new Getset();
	 
	 
	 //gs.setId(get_n);
	 //gs.setDescription(get_p);
	 //gs.setLikes(get_e);
	 //gs.setUrl(get_c);
	 //gs.setBy(get_d);
	 
	 //update up=new update();
	// up.updatedata();
	 
	//up.update1( get_n, get_p, get_e, get_c, get_d);
	 
	 

	}
	
	
	
	
	

}
