package java;

import jakarta.persistence.*;

@Entity
@Table(name = "role", schema = "plannings_meteo", catalog = "")
public class RoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_role", nullable = false)
    private Long idRole;
    @Basic
    @Column(name = "intitule", nullable = false, length = 20)
    private String intitule;

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
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

        RoleEntity that = (RoleEntity) o;

        if (idRole != null ? !idRole.equals(that.idRole) : that.idRole != null) return false;
        if (intitule != null ? !intitule.equals(that.intitule) : that.intitule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRole != null ? idRole.hashCode() : 0;
        result = 31 * result + (intitule != null ? intitule.hashCode() : 0);
        return result;
    }
}
