package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import java.util.List;

public class User {
    private long ID;
    private String username;
    private String userPassword;
    private boolean isAdmin;
    private List<Comment> comments;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User(String username, String userPassword, boolean isAdmin, List<Comment> comments) {
        this.username = username;
        this.userPassword = userPassword;
        this.isAdmin = isAdmin;
        this.comments = comments;
    }
}
