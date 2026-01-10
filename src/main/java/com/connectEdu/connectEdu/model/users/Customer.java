package com.connectEdu.connectEdu.model.users;

import com.connectEdu.connectEdu.model.course.CourseEnrollment;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer extends UserApp{
    private String subscription_tier;
    private LocalDate last_login;
    private String billing_info;
    @OneToMany(mappedBy = "customer")
    private List<CourseEnrollment> courses;
}
