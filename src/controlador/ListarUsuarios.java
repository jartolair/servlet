package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;

public class ListarUsuarios extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String nombre=request.getParameter("nombre");
		
		ArrayList<Usuario> usuarios=new ArrayList<>();
		Usuario u=new Usuario();
		u.setNombre(nombre);
		u.setEdad(10);
		usuarios.add(u);
		
		Usuario u2=new Usuario();
		u2.setNombre("tomas");
		u2.setEdad(10);
		usuarios.add(u2);
		
		//guardar en variable para enviar
		request.setAttribute("usuarios", usuarios);
		
		//redirijir a la pagina con la variable creada
		RequestDispatcher rd=request.getRequestDispatcher("ListarUsuarios.jsp");
		rd.forward(request, response);
		
	}
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String nombre=request.getParameter("nombre");
		
		ArrayList<Usuario> usuarios=new ArrayList<>();
		Usuario u=new Usuario();
		u.setNombre(nombre);
		u.setEdad(10);
		usuarios.add(u);
		
		Usuario u2=new Usuario();
		u2.setNombre("juan");
		u2.setEdad(10);
		usuarios.add(u2);
		
		//guardar en variable para enviar
		request.setAttribute("usuarios", usuarios);
		
		//redirijir a la pagina con la variable creada
		RequestDispatcher rd=request.getRequestDispatcher("ListarUsuarios.jsp");
		rd.forward(request, response);
		
	}

}
