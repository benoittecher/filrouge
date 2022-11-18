package java;

import jakarta.persistence.*;

@Entity
@Table(name = "type_evenement", schema = "plannings_meteo", catalog = "")
public class TypeEvenementEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_type_evenement", nullable = false)
    private Long idTypeEvenement;
    @Basic
    @Column(name = "intitule", nullable = true, length = 50)
    private String intitule;

    public Long getIdTypeEvenement() {
        return idTypeEvenement;
    }

    public void setIdTypeEvenement(Long idTypeEvenement) {
        this.idTypeEvenement = idTypeEvenement;
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

        TypeEvenementEntity that = (TypeEvenementEntity) o;

        if (idTypeEvenement != null ? !idTypeEvenement.equals(that.idTypeEvenement) : that.idTypeEvenement != null)
            return false;
        if (intitule != null ? !intitule.equals(that.intitule) : that.intitule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTypeEvenement != null ? idTypeEvenement.hashCode() : 0;
        result = 31 * result + (intitule != null ? intitule.hashCode() : 0);
        return result;
    }
}
