package com.connectEdu.connectEdu.model.course;

import com.connectEdu.connectEdu.model.users.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses_enrollment")
public class CourseEnrollment {
    @EmbeddedId
    private CourseEnrollmentId course_enrollment_id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private Customer customer;

    @ManyToOne
    @MapsId("course_id")
    @JoinColumn(name = "course_id")
    private CourseReference course;
    private LocalDate enrollment_date;
    @DecimalMin("0.0")
    @DecimalMax("100.0")
    private double course_progress;
    @Enumerated(EnumType.STRING)
    private CompletionStatus completion_status;

}
