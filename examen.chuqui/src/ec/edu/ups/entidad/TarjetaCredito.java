package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class TarjetaCredito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int numTar;
	private String nomTitular;
	private String fechaCaducidad;
	private int codFerificacion;
	
	@ManyToOne
	private Pedido pedido;
	
	@Transient
    private boolean editable;

	public TarjetaCredito() {
		// TODO Auto-generated constructor stub
	}

	
	public boolean isEditable() {
		return editable;
	}


	public void setEditable(boolean editable) {
		this.editable = editable;
	}


	public int getNumTar() {
		return numTar;
	}

	public void setNumTar(int numTar) {
		this.numTar = numTar;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getCodFerificacion() {
		return codFerificacion;
	}

	public void setCodFerificacion(int codFerificacion) {
		this.codFerificacion = codFerificacion;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [numTar=" + numTar + ", nomTitular=" + nomTitular + ", fechaCaducidad=" + fechaCaducidad
				+ ", codFerificacion=" + codFerificacion + ", pedido=" + pedido + "]";
	}

}
