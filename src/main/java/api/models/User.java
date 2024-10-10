package api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

    private String email;
    private String name;
    private String password;

    public User(String email, String password, String name) {
    }

    @Override
    public String toString() {
        return "email: " + email + ", password: " + password + ", name: " + name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}