package com.p3soft.onlineschool.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tbl_course")
@Getter
@Setter
public class Course {
    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", hours=" + hours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return id == course.id && price == course.price && hours == course.hours && Objects.equals(courseName, course.courseName) && Objects.equals(teacherName, course.teacherName) && Objects.equals(imageUrl, course.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, teacherName, price, imageUrl, hours);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String courseName;
    private String teacherName;
    private int price;
    private String imageUrl;
    private int hours;


}
