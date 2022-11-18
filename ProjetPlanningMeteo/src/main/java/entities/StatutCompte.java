package entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "statut_compte", schema = "plannings_meteo")
public class StatutCompte {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_statut_compte", nullable = false)
    private Long idStatutCompte;

    @Column(name = "intitule", nullable = false, length = 50)
    private String intitule;

    @OneToMany (targetEntity = Utilisateur.class, mappedBy = "statutCompte")
    private List<Utilisateur> utilisateurs = new ArrayList<>();

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

}
