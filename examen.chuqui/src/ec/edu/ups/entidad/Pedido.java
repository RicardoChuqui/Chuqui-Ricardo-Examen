package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


@Entity
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idPedido;
	private String fecha;
	private String nomCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String opservacion;
	
	@ManyToOne
	private Comidas comida;
	
	@Transient
    private boolean editable;
	
	public Comidas getComida() {
		return comida;
	}


	public void setComida(Comidas comida) {
		this.comida = comida;
	}



	public Pedido() {
		
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}



	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getNomCliente() {
		return nomCliente;
	}


	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getOpservacion() {
		return opservacion;
	}


	public void setOpservacion(String opservacion) {
		this.opservacion = opservacion;
	}


	public boolean isEditable() {
		return editable;
	}


	public void setEditable(boolean editable) {
		this.editable = editable;
	}


	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", nomCliente=" + nomCliente + ", subtotal="
				+ subtotal + ", iva=" + iva + ", total=" + total + ", opservacion=" + opservacion + ", comida=" + comida
				+ "]";
	}


	

}
