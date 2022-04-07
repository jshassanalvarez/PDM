package es.FootallShop.pdm.clases;

public class ProductoImpl implements Producto {
	
	enum Tipo
	{
	    CAMISETA,CHANDAL;
	}
	
	private int id;
	private Tipo tipo;
	private String marca;
	private String equipo;
	private float precio;
	private String talla;
	private String foto;
	private String descripcion;
	
	public ProductoImpl(int id, Tipo tipo, String marca, String equipo, float precio,String talla, 
			String foto, String descripcion) {
		this.id = id;
		this.tipo =tipo;
		this.marca = marca;
		this.equipo =equipo;
		this.precio = precio;
		this.talla = talla;
		this.foto = foto;
		this.descripcion = descripcion;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	

	@Override
	public Tipo getTipo() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

	

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	

	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return this.equipo;
	}

	

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	

	@Override
	public String getTalla() {
		// TODO Auto-generated method stub
		return this.talla;
	}

	

	@Override
	public String getFoto() {
		// TODO Auto-generated method stub
		return this.foto;
	}

	

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	
}
