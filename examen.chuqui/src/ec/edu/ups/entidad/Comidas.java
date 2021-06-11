package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Comidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idComida;
	private String nombreC;
	private double precioUnitario;
  
	
	
	@Transient
    private boolean editable;
	
	public Comidas() {
		// TODO Auto-generated constructor stub
	}

	public int getIdComida() {
		return idComida;
	}

	public void setIdComida(int idComida) {
		this.idComida = idComida;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	 @Override
	    public boolean equals(Object obj) {
		if (this == obj)
		    return true;
		if (obj == null)
		    return false;
		if (getClass() != obj.getClass())
		    return false;
		Comidas other = (Comidas) obj;
		if (idComida != other.idComida)
		    return false;
		return true;
	    }
	@Override
	public String toString() {
		return "Comidas [idComida=" + idComida + ", nombreC=" + nombreC + ", precioUnitario=" + precioUnitario + "]";
	}

	

}
