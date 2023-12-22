package practice.practice.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Board {

    @Id
    private String board_key ;
    private String id;
    private String conts;
    private String site_key;
    private String mng_key;
    private String reg_time;
    private String modi_time;
    private String reg_ip;
    private String modi_ip;
    private String state;
    private String title;

}
