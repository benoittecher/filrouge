package java;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur", schema = "plannings_meteo", catalog = "")
public class UtilisateurEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur;
    @Basic
    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;
    @Basic
    @Column(name = "mail", nullable = true, length = 50)
    private String mail;
    @Basic
    @Column(name = "ville", nullable = true, length = 50)
    private String ville;
    @Basic
    @Column(name = "pays", nullable = true, length = 50)
    private String pays;
    @Basic
    @Column(name = "photo", nullable = true, length = 50)
    private String photo;
    @Basic
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    @Basic
    @Column(name = "mot_de_passe", nullable = true, length = 250)
    private String motDePasse;
    @Basic
    @Column(name = "id_statut_compte", nullable = false)
    private Long idStatutCompte;
    @Basic
    @Column(name = "id_role", nullable = false)
    private Long idRole;

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

    public Long getIdStatutCompte() {
        return idStatutCompte;
    }

    public void setIdStatutCompte(Long idStatutCompte) {
        this.idStatutCompte = idStatutCompte;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UtilisateurEntity that = (UtilisateurEntity) o;

        if (idUtilisateur != null ? !idUtilisateur.equals(that.idUtilisateur) : that.idUtilisateur != null)
            return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (ville != null ? !ville.equals(that.ville) : that.ville != null) return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (motDePasse != null ? !motDePasse.equals(that.motDePasse) : that.motDePasse != null) return false;
        if (idStatutCompte != null ? !idStatutCompte.equals(that.idStatutCompte) : that.idStatutCompte != null)
            return false;
        if (idRole != null ? !idRole.equals(that.idRole) : that.idRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilisateur != null ? idUtilisateur.hashCode() : 0;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (motDePasse != null ? motDePasse.hashCode() : 0);
        result = 31 * result + (idStatutCompte != null ? idStatutCompte.hashCode() : 0);
        result = 31 * result + (idRole != null ? idRole.hashCode() : 0);
        return result;
    }
}
