package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
import modelo.UsuarioModelo;

public class Logear extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nombre =request.getParameter("nombre");
		String password=request.getParameter("password");
		
		

		if(nombre.equals("zubiri")&&password.equals("manteo")){
			
			HttpSession session=request.getSession();
			Usuario usuario=new Usuario();
			usuario.setNombre(nombre);
			session.setAttribute("usuarioLogeado", usuario);
			
			RequestDispatcher rd=request.getRequestDispatcher("ListarUsuarios");
			rd.forward(request, response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("adios.html");
			rd.forward(request, response);
		}
	}

}
