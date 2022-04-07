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

@WebServlet(urlPatterns= {"/iniciarSesion"})

public class iniciarSesionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String correo = req.getParameter("correo");
		String contra = req.getParameter("contra");
		resp.setContentType("text/plain");
		PrintWriter writer;
		
		try {
			writer = resp.getWriter();
			PruebaBD.crearUsuarios();
			
			for (Usuario u: PruebaBD.getUsuarios()) {
				
				if (u.getCorreoElectronico().equalsIgnoreCase(correo) && u.getContrasena().equals(contra) ) {
					writer.write("Usuario Registrado en el sistema");
				}
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
