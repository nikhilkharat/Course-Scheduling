package com.lms.CourseScheduling.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer regNo;
    private String fullName;
    private String email;
    private String courseName;
    private LocalDate date;
    private String status;

    @JsonIgnore
    @OneToOne
    private Course course;
}
