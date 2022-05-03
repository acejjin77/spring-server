package followapp.follow.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;
    private String gender;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "device_os")
    private Device deviceOs;

    public enum Device {
        Android, IOS
    }
}
