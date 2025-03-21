package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.User;

import java.util.List;

public class UserDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    // Constructor initializes the EntityManager
    public UserDAO() {
        emf = Persistence.createEntityManagerFactory("userPU"); // "userPU" is the persistence unit name
        em = emf.createEntityManager();
    }

    // Method to save a new user
    public void save(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    // Method to update an existing user
    public void update(User user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    // Method to find a user by ID
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    // Method to get all users
    public List<User> findAll() {
        TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
        return query.getResultList();
    }

    // Close the EntityManager and EntityManagerFactory when done
    public void close() {
        em.close();
        emf.close();
    }
}
