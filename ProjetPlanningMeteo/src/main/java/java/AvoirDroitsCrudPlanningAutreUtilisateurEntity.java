package java;

import jakarta.persistence.*;

@Entity
@Table(name = "avoir_droits_crud_planning_autre_utilisateur", schema = "plannings_meteo", catalog = "")
@IdClass(AvoirDroitsCrudPlanningAutreUtilisateurEntityPK.class)
public class AvoirDroitsCrudPlanningAutreUtilisateurEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_utilisateur_1", nullable = false)
    private Long idUtilisateur1;
    @Basic
    @Column(name = "peut_lire", nullable = true)
    private Boolean peutLire;
    @Basic
    @Column(name = "peut_creer", nullable = true)
    private Boolean peutCreer;
    @Basic
    @Column(name = "peut_modifier", nullable = true)
    private Boolean peutModifier;
    @Basic
    @Column(name = "peut_supprimer", nullable = true)
    private Boolean peutSupprimer;

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

    public Boolean getPeutLire() {
        return peutLire;
    }

    public void setPeutLire(Boolean peutLire) {
        this.peutLire = peutLire;
    }

    public Boolean getPeutCreer() {
        return peutCreer;
    }

    public void setPeutCreer(Boolean peutCreer) {
        this.peutCreer = peutCreer;
    }

    public Boolean getPeutModifier() {
        return peutModifier;
    }

    public void setPeutModifier(Boolean peutModifier) {
        this.peutModifier = peutModifier;
    }

    public Boolean getPeutSupprimer() {
        return peutSupprimer;
    }

    public void setPeutSupprimer(Boolean peutSupprimer) {
        this.peutSupprimer = peutSupprimer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvoirDroitsCrudPlanningAutreUtilisateurEntity that = (AvoirDroitsCrudPlanningAutreUtilisateurEntity) o;

        if (idUtilisateur != null ? !idUtilisateur.equals(that.idUtilisateur) : that.idUtilisateur != null)
            return false;
        if (idUtilisateur1 != null ? !idUtilisateur1.equals(that.idUtilisateur1) : that.idUtilisateur1 != null)
            return false;
        if (peutLire != null ? !peutLire.equals(that.peutLire) : that.peutLire != null) return false;
        if (peutCreer != null ? !peutCreer.equals(that.peutCreer) : that.peutCreer != null) return false;
        if (peutModifier != null ? !peutModifier.equals(that.peutModifier) : that.peutModifier != null) return false;
        if (peutSupprimer != null ? !peutSupprimer.equals(that.peutSupprimer) : that.peutSupprimer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilisateur != null ? idUtilisateur.hashCode() : 0;
        result = 31 * result + (idUtilisateur1 != null ? idUtilisateur1.hashCode() : 0);
        result = 31 * result + (peutLire != null ? peutLire.hashCode() : 0);
        result = 31 * result + (peutCreer != null ? peutCreer.hashCode() : 0);
        result = 31 * result + (peutModifier != null ? peutModifier.hashCode() : 0);
        result = 31 * result + (peutSupprimer != null ? peutSupprimer.hashCode() : 0);
        return result;
    }
}
