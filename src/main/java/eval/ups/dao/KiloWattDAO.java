package eval.ups.dao;
import java.util.List;

import jakarta.ejb.Stateless;
import eval.ups.model.KiloWatt;

@Stateless
public class KiloWattDAO extends GenericDAO<KiloWatt, Integer>{

    @Override
    public KiloWatt get(Integer param) {
        KiloWatt entity = em.find(KiloWatt.class, param);
        return entity;
    }

    @Override
    public List<KiloWatt> getAll() {
        String jpql = "SELECT p FROM KiloWatt p";
        return em.createQuery(jpql).getResultList();
    }

}
