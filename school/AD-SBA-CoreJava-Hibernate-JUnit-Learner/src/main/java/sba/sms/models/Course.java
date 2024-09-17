package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Course is a POJO, configured as a persistent class that represents (or maps to) a table
 * name 'course' in the database. A Course object contains fields that represent course
 * information and a mapping of 'courses' that indicate an inverse or referencing side
 * of the relationship. Implement Lombok annotations to eliminate boilerplate code.
 */

 @Entity
 @Table(name = "course")
 public class Course {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private int id;
 
     @Column(name = "name", length = 50, nullable = false)
     private String name;
 
     @Column(name = "instructor", length = 50, nullable = false)
     private String instructor;
 
     @ManyToMany(mappedBy = "courses", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
     private Set<Student> students = new HashSet<>();
 
     // Constructors
     public Course() {}
 
     public Course(int id, String name, String instructor) {
         this.id = id;
         this.name = name;
         this.instructor = instructor;
     }
 
     // Getters and Setters
     // toString, equals, and hashCode methods (without collections in toString)
 }