//package com.zyy.test.chap18;////import java.io.*;////import javax.servlet.*;//import javax.servlet.http.*;////public class KathyServlet extends HttpServlet {//     public void doGet (HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException  {//	 PrintWriter out;//	 String title = "PhraseOMatic has generated the following phrase.";//         response.setContentType("text/html");//	 out = response.getWriter();////        out.println("<HTML><HEAD><TITLE>");//	out.println("PhraseOmatic");//	out.println("</TITLE></HEAD><BODY>");//	out.println("<H1>" + title + "</H1>");//	out.println("<P>" + PhraseOMatic2.makePhrase());//        out.println("<P><a href=\"KathyServlet\">make another phrase</a></p>");//	out.println("</BODY></HTML>");////	out.close();//    }//}