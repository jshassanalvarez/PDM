package es.FootallShop.pdm.clases;

import es.FootallShop.pdm.clases.ProductoImpl.Tipo;

public interface Producto {

	public int getId ();
	
	public Tipo getTipo();
	
	public String getMarca();
	
	public String getEquipo();

	public float getPrecio();
	
	public String getTalla();
	
	public String getFoto();
	
	public String getDescripcion();
	
	
}
