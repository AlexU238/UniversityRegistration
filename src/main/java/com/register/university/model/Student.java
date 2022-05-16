package com.register.university.model;

import com.register.university.util.CurrentYear;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;

    @Column(name = "name")
    protected String name;
    @Column(name = "surname")
    protected String surname;
    @Column(name = "date_of_birth")
    protected Date dateOfBirth;
    @Column(name = "citizenship")
    protected String citizenship;
    @Column(name = "faculty")
    protected String faculty;
    @Column(name = "program")
    protected String program;
    @Column(name = "sex")
    protected String sex;
    @Column(name = "email")
    protected String email;
    @Column(name = "graduated_school")
    protected String graduatedSchool;
    @Column(name = "registration_year")
    protected int yearOfRegistration;

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }


    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", faculty='" + faculty + '\'' +
                ", program='" + program + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", graduatedSchool='" + graduatedSchool + '\'' +
                ", yearOfRegistration=" + yearOfRegistration +
                '}';
    }
}
