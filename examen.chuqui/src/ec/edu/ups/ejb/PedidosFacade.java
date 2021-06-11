package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Pedido;

@Stateless
public class PedidosFacade extends AbstractFacade<Pedido>  {
	 @PersistenceContext(unitName = "examen.chuqui")
	    private EntityManager em;

	    public PedidosFacade() {
	        super(Pedido.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	    
	}
