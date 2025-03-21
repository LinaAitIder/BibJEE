package controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import model.User;
import model.UserDAO;

import java.io.Serializable;

@Named
@SessionScoped
public class UserController implements Serializable {

    private User user;

    private UserDAO userDAO;

    public UserController() {
        user = new User();
        userDAO = new UserDAO(); // Initialize the UserDAO
    }

    // Getter and Setter for the User object
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Method to add or update the user
    public String addUpdateUser() {
        if (user.getId() == null) {
            // Adding a new user
            userDAO.save(user);
        } else {
            // Updating an existing user
            userDAO.update(user);
        }
        return "userList"; // Redirect to a list of users (you can modify this to any page you like)
    }

    // You can create a method to reset the user object after an action (optional)
    public void resetUser() {
        this.user = new User(); // Reset the user object for a new form
    }
}
