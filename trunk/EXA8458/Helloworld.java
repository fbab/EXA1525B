package org.prodageo ;

import java.io.* ;
import javax.servlet.http.* ;
import javax.servlet.* ;

public class helloworld extends HttpServlet
{
	public void doGet (HttpServletRequest req, HttpServletResponse res)
		throw ServletException, IOException
	{
		PrintWriter out = res.getWriter () ;
		
		out.println ( "Hello, world, mani�re GET" ) ;
		out.close() ;
	}
}
