package com.cs5004finalprojectvtam.gradebookviewerv2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/* POJO - Plain old Java Object class Assignments
 * Represents an Assignment with an id, title, score, letter grade, and the corresponding student
 */
@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // id is auto generated
    private Long id;
    private String title;
    private Integer score;
    private String grade;
    @ManyToOne // there are multiple assignments for each student. (ManyToOne relationship)
    private Student student;
    /* empty constructor, required to use spring JPA */
    public Assignment() {
    }
    /* non-empty constructor */
    public Assignment(String title, Integer score, String grade, Student student) {
        this.title = title;
        this.score = score;
        this.grade = grade;
        this.student = student;
    }
    /* getters and setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Assignments{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", score=" + score +
            ", grade='" + grade + '\'' +
            ", student=" + student +
            '}';
    }
    /* override equals and hashcode functions to allow comparison between objects */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Assignment that = (Assignment) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
