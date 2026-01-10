package com.connectEdu.connectEdu.model.course;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CourseEnrollmentId implements Serializable {
    private Long customer_id;
    private Long course_id;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CourseEnrollmentId that = (CourseEnrollmentId) o;
        return Objects.equals(customer_id, that.customer_id) && Objects.equals(course_id, that.course_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_id, course_id);
    }
}
