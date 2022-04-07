package es.FootallShop.pdm.clases;

import java.sql.Date;
import java.util.List;



public class PedidoImpl implements Pedido{

	enum MetodoPago
	{
	    TARJETA, PAYPAL, CONTRAREMBOLSO;
	}
	
	private int id;
	private List<Producto> productos;
	private String direccion;
	private MetodoPago metodoPago;
	private Date fecha_pedido;
	private Date fecha_entrega;
	private String correo;
	private int numTlf;
	private float precio;
	private boolean estado;
	
	public PedidoImpl(int id, List<Producto> productos,String direccion,MetodoPago metodoPago,Date fecha_pedido, Date fecha_entrega, String correo, int numTlf, float precio, boolean estado) {
		this.id= id;
		this.productos = productos;
		this.direccion = direccion;
		this.metodoPago = metodoPago;
		this.fecha_pedido=fecha_pedido;
		this.fecha_entrega=fecha_entrega;
		this.correo=correo;
		this.numTlf=numTlf;
		this.precio=precio;
		this.estado=estado;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public List<Producto> getProductosComprados() {
		// TODO Auto-generated method stub
		return this.productos;
	}

	@Override
	public void setProductosComprados(List<Producto> listaProductos) {
		this.productos = listaProductos;
		
	}

	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return this.direccion;
	}

	@Override
	public MetodoPago getMetodoPago() {
		// TODO Auto-generated method stub
		return this.metodoPago;
	}

	@Override
	public Date getFechaPedido() {
		// TODO Auto-generated method stub
		return this.fecha_pedido;
	}

	@Override
	public Date getFechaEntrega() {
		// TODO Auto-generated method stub
		return this.fecha_entrega;
	}

	@Override
	public String getCorreo() {
		// TODO Auto-generated method stub
		return this.correo;
	}

	@Override
	public int getNumTlf() {
		// TODO Auto-generated method stub
		return this.numTlf;
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	@Override
	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		this.precio = precio;
	}

	@Override
	public boolean getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	@Override
	public void setEstado(boolean estado) {
		// TODO Auto-generated method stub
		this.estado = estado;
	}
}
