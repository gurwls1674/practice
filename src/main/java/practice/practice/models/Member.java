package practice.practice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Member {
    @Id
    private String username;
    private String password;
    private String email;
    private String name;
    private String location;

    @ManyToMany
    @JoinTable(
            name = "auth_member",
            joinColumns = @JoinColumn(name="member_id"),
            inverseJoinColumns = @JoinColumn(name="auth_key"))
    private List<Auth> auth;
}
