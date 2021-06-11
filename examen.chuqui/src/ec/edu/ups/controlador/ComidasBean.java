package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidasFacade;
import ec.edu.ups.ejb.PedidosFacade;
import ec.edu.ups.entidad.Comidas;
import ec.edu.ups.entidad.Pedido;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class ComidasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EJB
    private PedidosFacade pedidosFacade;
    
    @EJB
    private ComidasFacade comidasFacade;
    
    private List<Pedido> pedidolist;
    private Pedido pedidos;
    
    public Pedido getPedidos() {
		return pedidos;
	}



	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}


	private int idComida;
	private String nombreC;
	private double precioUnitario;
	
	

	public List<Pedido> getPedidolist() {
		return this.pedidosFacade.findAll();
	}



	public void setPedidolist(List<Pedido> pedidolist) {
		this.pedidolist = pedidolist;
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

	public String guardar()
    {
           Comidas c = new  Comidas();
           c.setNombreC(nombreC);
           c.setPrecioUnitario(precioUnitario);
           
           this.comidasFacade.create(c);
           this.idComida = c.getIdComida();
           return "ComidasCreate";
          
    }
       
    public String prepareList() {
        return "ComidasLista";
    }
    public String prepareCreate() {
        return "ComidasCreate";
    }
    public String Eliminar(Comidas c)
    {
    	comidasFacade.remove(c);
    	 
    	comidasFacade.findAll();
    	return null;
    }
    public String Editar(Comidas c)
    {
    	c.setEditable(true);
        return null;
    }
    public String GuardarEdicion(ComidasBean bp, Long id)
    {
    	 Comidas c = new  Comidas();
    	 c.setNombreC(bp.nombreC);
         c.setPrecioUnitario(bp.precioUnitario);
      
       
       this.comidasFacade.edit(c);
       return "ComidasLista";
    }
    

	public ComidasBean() {
		// TODO Auto-generated constructor stub
	}

}
