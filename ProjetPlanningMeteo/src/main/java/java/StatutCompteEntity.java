package java;

import jakarta.persistence.*;

@Entity
@Table(name = "statut_compte", schema = "plannings_meteo", catalog = "")
public class StatutCompteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_statut_compte", nullable = false)
    private Long idStatutCompte;
    @Basic
    @Column(name = "intitule", nullable = false, length = 50)
    private String intitule;

    public Long getIdStatutCompte() {
        return idStatutCompte;
    }

    public void setIdStatutCompte(Long idStatutCompte) {
        this.idStatutCompte = idStatutCompte;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatutCompteEntity that = (StatutCompteEntity) o;

        if (idStatutCompte != null ? !idStatutCompte.equals(that.idStatutCompte) : that.idStatutCompte != null)
            return false;
        if (intitule != null ? !intitule.equals(that.intitule) : that.intitule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStatutCompte != null ? idStatutCompte.hashCode() : 0;
        result = 31 * result + (intitule != null ? intitule.hashCode() : 0);
        return result;
    }
}
