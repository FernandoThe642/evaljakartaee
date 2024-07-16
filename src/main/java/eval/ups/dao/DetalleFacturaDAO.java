package eval.ups.dao;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import eval.ups.model.DetalleFactura;

@Stateless
public class DetalleFacturaDAO extends GenericDAO<DetalleFactura, Integer>{

    @Override
    public DetalleFactura get(Integer param) {
        DetalleFactura entity = em.find(DetalleFactura.class, param);
		return entity;
    }

    @Override
    public List<DetalleFactura> getAll() {
        String jpql = "SELECT df FROM DetalleFactura df";
		Query query = em.createQuery(jpql);
		return query.getResultList();
    }


}
