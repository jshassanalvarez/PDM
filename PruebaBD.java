package es.FootballShop.pdm.BD;

import java.util.LinkedList;
import java.util.List;

import es.FootallShop.pdm.clases.UsuarioImpl;
import es.FootallShop.pdm.clases.Usuario;
import es.FootallShop.pdm.clases.Producto;
import es.FootallShop.pdm.clases.ProductoImpl;

public class PruebaBD {

	static List<Usuario> listaUsuarios = new LinkedList<Usuario>();
	
	public static void crearUsuarios() {
		
		Usuario u1 = new UsuarioImpl(1,"Jabril", "Hassan",662678543,"jha@gmail.com","C/hola nº2", 41450,"1998-04-02","1234");
		listaUsuarios.add(u1);
		Usuario u2 = new UsuarioImpl(2,"Pedro", "Blasco",682478313,"pbe@gmail.com","C/hola nº2", 41450, "02-07-1998" ,"1234");
		listaUsuarios.add(u2);
	}
	
	public static void añadirUsuario(Usuario u) {
		listaUsuarios.add(u);
	}
	
	public static List<Usuario> getUsuarios() {
		return listaUsuarios;
	}
}

