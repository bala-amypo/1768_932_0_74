to me


---------- Forwarded message ---------
From: 727824TUCS456 VISWA M S <727824TUCS456@skct.edu.in>
Date: Wed, Dec 17, 2025 at 11:36 AM
Subject:
To: <727824tucs458@skct.edu.in>, <727824tucs414@skct.edu.in>


package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public StudentEntity(Long id,String name,String email, float cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public StudentEntity(){

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }


    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public float getCgpa() {
        return cgpa;
    }

    
}   