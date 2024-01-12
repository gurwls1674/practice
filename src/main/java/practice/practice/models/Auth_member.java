package practice.practice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Auth_member {

    @EmbeddedId
    private AuthMemberId authMemberId;

    @ManyToOne
    @MapsId("memberId")
    @JoinColumn(name = "member_id")
    private Member member;

}
