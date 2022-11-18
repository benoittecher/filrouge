package entities;

import java.io.Serializable;

public class AvoirDroitsCrudPlanningAutreUtilisateurPK implements Serializable {

    private Utilisateur proprietaire;

    private Utilisateur ayantDroit;

    public Utilisateur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Utilisateur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Utilisateur getAyantDroit() {
        return ayantDroit;
    }

    public void setAyantDroit(Utilisateur ayantDroit) {
        this.ayantDroit = ayantDroit;
    }
}
