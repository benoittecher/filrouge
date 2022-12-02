package dao;

import entities.AvoirDroitsCrudPlanningAutreUtilisateur;
import entities.TypeEvenement;
import entities.Utilisateur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

public class AvoirDroitsCrudPlanningAutreUtilisateurJPADAO {

    public List<AvoirDroitsCrudPlanningAutreUtilisateur> findAll() {
        EntityManager em = ConnectionManager.getEntityManager();
        TypedQuery<AvoirDroitsCrudPlanningAutreUtilisateur> query = em.createQuery("select ad from AvoirDroitsCrudPlanningAutreUtilisateur ad", AvoirDroitsCrudPlanningAutreUtilisateur.class);
        List<AvoirDroitsCrudPlanningAutreUtilisateur> ads = query.getResultList();
        em.close();
        return ads;
    }


    public Optional<AvoirDroitsCrudPlanningAutreUtilisateur> findByIds(Long idProprietaire, Long idAyantDroit) {
       return null;
    }


    public boolean delete(Long id) {

        return false;
    }

    public boolean update(AvoirDroitsCrudPlanningAutreUtilisateur element) {
        return false;
    }
}
