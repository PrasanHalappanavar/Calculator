package PSH;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcPSH extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		double n1=Double.parseDouble(req.getParameter("num1"));
		double n2=Double.parseDouble(req.getParameter("num2"));
		String oprt=req.getParameter("oprt");
		double result=0;
		if(oprt.equals("+"))
			result=n1+n2;
		else if(oprt.equals("-"))
			result=n1-n2;
		else if(oprt.equals("*"))
			result=n1*n2;
		else if(oprt.equals("/"))
			result=n1/n2;
		else if(oprt.equals("%"))
			result=n1%n2;
		out.println("<html><center><body><h2>Result= "+result+"</h2></body></center></html>");
	}
}
