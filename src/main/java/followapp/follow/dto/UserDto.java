package followapp.follow.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDto {

    @Getter
    @Setter
    public static class Userinfo {
        private Long id;
        private String username;
        private String birthDt;
        private String gender;
    }
}
