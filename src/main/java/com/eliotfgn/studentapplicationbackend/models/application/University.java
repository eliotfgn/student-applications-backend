package com.eliotfgn.studentapplicationbackend.models.application;

import com.eliotfgn.studentapplicationbackend.models.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class University extends BaseEntity {
    private String name;
    @OneToMany
    private List<Course> courses;

    public University() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
