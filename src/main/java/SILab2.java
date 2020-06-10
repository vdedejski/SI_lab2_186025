import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function(User user, List<String> allUsers) { // A
        if (user != null) { // B
            if (user.getUsername() != null && user.getEmail() != null && !allUsers.contains(user.getUsername())) { // C
                boolean atChar = false, dotChar = false; // D, E
                for (int i = 0; i < user.getEmail().length(); i++) { // F, G, H
                    if (user.getEmail().charAt(i) == '@') {// I
                        atChar = true; // J
                    }
                    if (atChar && user.getEmail().charAt(i) == '.') { // K
                        dotChar = true; // L
                    }
                } // M
                if (atChar && dotChar) { // N
                    return true; // O
                }
            } // P
        } // Q
        return false; // R
    } // S
}