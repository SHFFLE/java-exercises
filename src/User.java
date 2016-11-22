/**
 * User class is the blueprint for users of our application
 * Classes are like function definitions that return an object of that class' type
 * Objects of that class' type are returned when we call 'newUser()'
 * Generic classes mean we can re-use the code regardless of the implementation
 * Where the implementation is mobile, desktop, web app, console app, or embedded device
 * Class based code doesn't run until we call it (like calling a function)
 * instantiating (calling) a class is done by 'new User()'
 *
 * User newUser = new User();
 */

public class User {
    String email;
    String username;
    String password;
    String permissionLevel;
    boolean isAdmin;
    boolean userSavedToDatabase;

//    Pretend that svaeUser talks to the DB
//    Attempts to save
//    If DB connection is good and save successful, return true

    public boolean saveUser() {
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
