package com.connectEdu.connectEdu.model.users;

import com.connectEdu.connectEdu.model.course.CourseReference;
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
@Table(name = "instructors")
public class Instructor extends UserApp {
    private String instructor_skills;
    private String biography;
    private LocalDate start_date;
    @OneToMany(mappedBy = "instructor")
    private List<CourseReference> courses;
}
