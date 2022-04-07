package es.FootallShop.pdm.clases;

import java.sql.Date;

public class UsuarioImpl implements Usuario {

	private int id;
	private String nombre;
	private String apellidos;
	private int numeroTelefono;
	private String correoElectronico;
	private String direccion;
	private int codigoPostal;
	private String fechaNacimiento;
	private String contrasena;
	
	public UsuarioImpl(int id, String nombre,String apellidos, int numeroTelefono, String correoElectronico, String direccion, int codigoPostal,
			String fechaNacimiento, String contrasena){
		
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroTelefono =numeroTelefono;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.fechaNacimiento = fechaNacimiento;
		this.contrasena = contrasena;
		
		
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre =nombre;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return this.apellidos;
	}

	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		this.apellidos=apellido;
	}

	@Override
	public int getNumeroTelefono() {
		// TODO Auto-generated method stub
		return this.numeroTelefono;
	}

	@Override
	public void setNumeroTelefono(int numeroTelefono) {
		// TODO Auto-generated method stub
		this.numeroTelefono=numeroTelefono;
	}

	@Override
	public String getCorreoElectronico() {
		// TODO Auto-generated method stub
		return this.correoElectronico;
	}

	@Override
	public void setCorreoElectronico(String correoElectronico) {
		// TODO Auto-generated method stub
		this.correoElectronico=correoElectronico;
	}

	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return this.direccion;
	}

	@Override
	public void setDireccion(String direccion) {
		// TODO Auto-generated method stub
		this.direccion=direccion;
	}

	@Override
	public int getcodigoPostal() {
		// TODO Auto-generated method stub
		return this.codigoPostal;
	}

	@Override
	public void setCodigoPostal(int codigoPostal) {
		// TODO Auto-generated method stub
		this.codigoPostal=codigoPostal;
	}

	@Override
	public String getFechaNacimiento() {
		// TODO Auto-generated method stub
		return this.fechaNacimiento;
	}

	
	

	@Override
	public String getContrasena() {
		// TODO Auto-generated method stub
		return this.contrasena;
	}

	@Override
	public void setContrasena(String contrasena) {
		// TODO Auto-generated method stub
		this.contrasena=contrasena;
	}
	

}
