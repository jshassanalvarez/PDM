package es.FootallShop.pdm.clases;

import java.sql.Date;

public interface Usuario {
	
	public int getId();
	
	public String getNombre();
	public void setNombre(String nombre);
	public String getApellido();
	public void setApellido(String apellido);
	public int getNumeroTelefono();
	public void setNumeroTelefono(int numeroTelefono);
	public String getCorreoElectronico();
	public void setCorreoElectronico(String correoElectronico);
	public String getDireccion();
	public void setDireccion(String direccion);
	public int getcodigoPostal();
	public void setCodigoPostal(int codigoPostal);
	public String getFechaNacimiento();
	public String getContrasena();
	public void setContrasena(String contrasena);
}
