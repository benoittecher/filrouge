import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = PersistenceManager.getInstance().createEntityManager();
    }
}
