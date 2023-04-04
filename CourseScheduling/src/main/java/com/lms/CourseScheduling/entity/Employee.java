package com.lms.CourseScheduling.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;

    @Pattern(regexp = "^[a-z A-Z]+$", message = "fullName must not contain numbers or special characters")
    private String fullName;

    @Size(min = 10, max = 10, message = "Mobile number must have 10 digits")
    @Digits(integer = 10, fraction = 0, message = "Mobile number must have 10 digits")
    private String mobileNumber;

    @Email
    private String email;
    private String gender;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,12}$", message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit")
    private String password;

    @JsonIgnore
    @OneToOne
    private Register register;
}
