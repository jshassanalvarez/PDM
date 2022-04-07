package es.FootallShop.pdm.clases;

import java.sql.Date;
import java.util.List;



import es.FootallShop.pdm.clases.PedidoImpl.MetodoPago;

public interface Pedido {
	
	public int getId();
	public List<Producto> getProductosComprados();
	public void setProductosComprados(List<Producto> listaProductos);
	public String getDireccion ();
	public MetodoPago getMetodoPago();
	public Date getFechaPedido();
	public Date getFechaEntrega();
	public String getCorreo();
	public int getNumTlf();
	public float getPrecio();
	public void setPrecio(int precio);
	public boolean getEstado();
	public void setEstado(boolean estado);
}
