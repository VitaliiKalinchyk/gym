package epam.gym.model.model;


import lombok.*;

@Setter
@Getter
@ToString
public abstract class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private boolean isActive;
}