package entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utilisateur", schema = "plannings_meteo")
public class Utilisateur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;

    @Column(name = "mail", nullable = false, length = 50, unique = true)
    private String mail;

    @Column(name = "ville", nullable = true, length = 50)
    private String ville;

    @Column(name = "pays", nullable = true, length = 50)
    private String pays;

    @Column(name = "photo", nullable = true, length = 50)
    private String photo;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "mot_de_passe", nullable = false, length = 250)
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "id_statut_compte")
    private StatutCompte statutCompte;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    @OneToMany (targetEntity = Evenement.class, mappedBy = "utilisateur", cascade = CascadeType.REMOVE)
    private List<Evenement> planning = new ArrayList<>();

    public List<Evenement> getPlanning() {
        return planning;
    }

    public void setPlanning(List<Evenement> planning) {
        this.planning = planning;
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public StatutCompte getStatutCompte() {
        return statutCompte;
    }

    public void setStatutCompte(StatutCompte statutCompte) {
        this.statutCompte = statutCompte;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
