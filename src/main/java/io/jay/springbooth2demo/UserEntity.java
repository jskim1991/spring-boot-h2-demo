package io.jay.springbooth2demo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "TB_USER")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String phone;
    private Boolean activated;

    public User toDomain() {
        User user = new User();
        user.setId(this.id);
        user.setName(this.name);
        user.setPhone(this.phone);
        user.setActivated(this.activated);
        return user;
    }
}
