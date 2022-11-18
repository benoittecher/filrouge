package java;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class AvoirDroitsCrudPlanningAutreUtilisateurEntityPK implements Serializable {
    @Column(name = "id_utilisateur", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    @Column(name = "id_utilisateur_1", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur1;

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Long getIdUtilisateur1() {
        return idUtilisateur1;
    }

    public void setIdUtilisateur1(Long idUtilisateur1) {
        this.idUtilisateur1 = idUtilisateur1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvoirDroitsCrudPlanningAutreUtilisateurEntityPK that = (AvoirDroitsCrudPlanningAutreUtilisateurEntityPK) o;

        if (idUtilisateur != null ? !idUtilisateur.equals(that.idUtilisateur) : that.idUtilisateur != null)
            return false;
        if (idUtilisateur1 != null ? !idUtilisateur1.equals(that.idUtilisateur1) : that.idUtilisateur1 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilisateur != null ? idUtilisateur.hashCode() : 0;
        result = 31 * result + (idUtilisateur1 != null ? idUtilisateur1.hashCode() : 0);
        return result;
    }
}
