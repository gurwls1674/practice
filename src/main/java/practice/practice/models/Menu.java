package practice.practice.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Menu {

    @Id
    private String key;
    private String site_key;
    private String name;
    private String depth;
    private String sort_num;
    private String parent_key;
    private String url;
    private String type;

}
