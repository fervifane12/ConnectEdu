package com.connectEdu.connectEdu.model.course;

import com.connectEdu.connectEdu.model.users.Instructor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses_reference")
public class CourseReference {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long course_id;
    private String course_name;
    @ManyToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "user_id")
    private Instructor instructor;
    private String course_description;
    private int course_rating;
    private Double course_price;
}