package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Comidas;



@Stateless
public class ComidasFacade extends AbstractFacade<Comidas>  {
	 @PersistenceContext(unitName = "examen.chuqui")
	    private EntityManager em;

	    public ComidasFacade() {
	        super(Comidas.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	    
	}