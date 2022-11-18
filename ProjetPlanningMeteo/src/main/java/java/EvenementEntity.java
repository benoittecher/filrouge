package java;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "evenement", schema = "plannings_meteo", catalog = "")
public class EvenementEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_evenement", nullable = false)
    private Long idEvenement;
    @Basic
    @Column(name = "intitule", nullable = false, length = 50)
    private String intitule;
    @Basic
    @Column(name = "debut", nullable = false)
    private Timestamp debut;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "lieu", nullable = true, length = 150)
    private String lieu;
    @Basic
    @Column(name = "fin", nullable = true)
    private Timestamp fin;
    @Basic
    @Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur;
    @Basic
    @Column(name = "id_type_evenement", nullable = false)
    private Long idTypeEvenement;

    public Long getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(Long idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Timestamp getDebut() {
        return debut;
    }

    public void setDebut(Timestamp debut) {
        this.debut = debut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Timestamp getFin() {
        return fin;
    }

    public void setFin(Timestamp fin) {
        this.fin = fin;
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Long getIdTypeEvenement() {
        return idTypeEvenement;
    }

    public void setIdTypeEvenement(Long idTypeEvenement) {
        this.idTypeEvenement = idTypeEvenement;
    }

}
