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
public class PedidosBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EJB
    private ComidasFacade comidasFacade;
    
    @EJB
    private PedidosFacade pedidosFacade;
    
    private List<Comidas> comidaslist;
    
    private Comidas comidas;
    private int idPedido;
	private String fecha;
	private String nomCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String opservacion;
	
	
	
	public Comidas getComidas() {
		return comidas;
	}


	public void setComidas(Comidas comidas) {
		this.comidas = comidas;
	}


	public ComidasFacade getComidasFacade() {
		return comidasFacade;
	}


	public void setComidasFacade(ComidasFacade comidasFacade) {
		this.comidasFacade = comidasFacade;
	}


	public List<Comidas> getComidaslist() {
		return this.comidasFacade.findAll();
	}


	public void setComidaslist(List<Comidas> comidaslist) {
		this.comidaslist = comidaslist;
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
	public String guardar()
    {
           Pedido p = new  Pedido();
           p.setFecha(fecha);
           p.setNomCliente(nomCliente);
           p.setSubtotal(subtotal);
           p.setIva(iva);
           p.setTotal(subtotal);
           
           this.pedidosFacade.create(p);
           this.idPedido = p.getIdPedido();
           return "PedidoCreate";
          
    }
       
    public String prepareList() {
        return "PedidosLista";
    }
    public String prepareCreate() {
        return "PedidosCreate";
    }
    public String Eliminar(Pedido p)
    {
    	pedidosFacade.remove(p);
    	 
    	pedidosFacade.findAll();
    	return null;
    }
    public String Editar(Pedido p)
    {
    	p.setEditable(true);
        return null;
    }
    public String GuardarEdicion(PedidosBean bp, Long id)
    {
    	 Pedido p = new  Pedido();
    	 p.setNomCliente(bp.nomCliente);
         p.setSubtotal(bp.subtotal);
         p.setIva(bp.iva);
         p.setTotal(bp.subtotal);
      
       
       this.pedidosFacade.edit(p);
       return "PedidosLista";
    }
    

	public PedidosBean() {
		// TODO Auto-generated constructor stub
	}

}
