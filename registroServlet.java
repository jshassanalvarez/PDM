package es.FootballShop.pdm.metodos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.FootallShop.pdm.clases.Usuario;
import es.FootallShop.pdm.clases.UsuarioImpl;
import es.FootballShop.pdm.BD.PruebaBD;

@WebServlet(urlPatterns= {"/registro"})

public class registroServlet extends  HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String idString = req.getParameter("id");
		Integer id = Integer.parseInt(idString);
		//
		String nombre = req.getParameter("nombre");
		String apellidos = req.getParameter("apellidos");
		//
		String telefonoString = req.getParameter("telefono");
		Integer telefono = Integer.parseInt(telefonoString);
		//
		String correo = req.getParameter("correo");
		String direccion = req.getParameter("direccion");
		//
		String codigoPostalString = req.getParameter("codigoPostal");
		Integer codigoPostal = Integer.parseInt(codigoPostalString);
		//
		String fechaNacimiento= req.getParameter("fechaNacimiento");
		String contra = req.getParameter("contra");
		
		
		resp.setContentType("text/plain");
		PrintWriter writer;
		
		try {
			writer = resp.getWriter();
			
			if (correo.contains("@") && fechaNacimiento.length()==10 /*(00/00/0000)*/ ) {
				
				Usuario u = new UsuarioImpl(id,nombre,apellidos,telefono,correo,direccion,codigoPostal,fechaNacimiento,contra);
				PruebaBD.añadirUsuario(u);
					writer.write("Usuario añadido al sistema");
			}
			
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
