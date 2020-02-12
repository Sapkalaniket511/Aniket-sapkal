/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.PrintWriter;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
/**
 *
 * @author student
 */
public class Login extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res)
throws ServletException, IOException {

                res.setContentType("text/html");
                PrintWriter out=res.getWriter();

                String username = req.getParameter("uid");
                String pass = req.getParameter("pass");

                if("aniket".equals(username) || "aniket".equals(pass))
                {
                       out.println("<html>");
                 out.println("<head><title>d1</title></head>");
                  out.println("<body>welcome   " + username);
                   out.println("</body>");
                    out.println("</html>");


                }
                else
                {
                    RequestDispatcher rd=req.getRequestDispatcher("index.html");
                    rd.forward(req,res);

                }


    }

   }
