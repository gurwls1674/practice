package practice.practice.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Data
@Embeddable
public class AuthMemberId implements Serializable {

    @Column(name = "auth_key")
    private Long authKey;

    @Column(name = "member_id")
    private Long memberId;
}
