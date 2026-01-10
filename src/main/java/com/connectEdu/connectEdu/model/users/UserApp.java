package com.connectEdu.connectEdu.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "app_users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Enumerated(EnumType.STRING)
    private UserType user_type;
    private String email;
    private String account_status;
    private String password_hash;
    private String firs_name;
    private String last_name;
}