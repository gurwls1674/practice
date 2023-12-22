package practice.practice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Auth_member {

    @Id
    @GeneratedValue
    @JoinTable(
            name = "auth",
            joinColumns = @JoinColumn(name="auth_key"),
            inverseJoinColumns = @JoinColumn(name="auth_key"))
    private Long auth_key;

    @ManyToMany
    @JoinTable(
            name = "member",
            joinColumns = @JoinColumn(name="username"),
            inverseJoinColumns = @JoinColumn(name="member_id"))
    private String member_id;
}
