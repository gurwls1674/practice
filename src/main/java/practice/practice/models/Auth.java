package practice.practice.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Auth {
    @Id
    @GeneratedValue
    private String auth_key;
    private String auth_detail;
    private String auth_name;
}
