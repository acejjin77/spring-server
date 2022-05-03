package followapp.follow.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Admin {

    @Id
    @Column(name = "admin_id")
    private String adminId;

    @Column(name = "admin_pw")
    private String adminPw;
}
