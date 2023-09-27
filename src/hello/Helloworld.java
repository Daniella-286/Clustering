/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class Helloworld
 */
public class Helloworld extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        ServletContext context = this.getServletContext();
        String name = req.getParameter("nom");

        if (name != null && !name.isEmpty()) {
            out.print("coucou " + name);
        } else {
            out.print("Veuillez entrer votre nom");
        }

        // Afficher le contenu du paramètre "paragraph" uniquement s'il n'est pas null
        String paragraph = req.getParameter("paragraph");
        if (paragraph != null) {
            out.println(paragraph);
        }
    }
}

