package dao;

import entities.Utilisateur;

public class DAOFactory {
    private DAOFactory() {

    }
    public static CrudDAO<Utilisateur> getUtilisateurJPADao(){
        return new UtilisateurJPADAO();
    }
}