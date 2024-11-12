package servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


@WebServlet("/Ingresar")
public class Formulario extends HttpServlet {
    @Override
    protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) {
        //seteamos el set
        response.setContentType("text/html");
        //dedeclara e inicializo
        String username = request.getParameter("username");
        //Declaro inicializo
        String password = request.getParameter("password");
    }

}
