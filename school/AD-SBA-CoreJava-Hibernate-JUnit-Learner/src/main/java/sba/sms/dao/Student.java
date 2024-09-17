package sba.sms.dao;

import sba.sms.models.Course;
import sba.sms.models.Student;

import sba.sms.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * The StudentI interface declares abstract methods and
 * is implemented by other classes to provide services for a student.
 */
public interface StudentI {
    List<Student> getAllStudents();
    void createStudent(Student student);
    
    Student getStudentByEmail(String email);

    boolean validateStudent(String email, String password);

    void registerStudentToCourse(String email, int courseId);

    List<Course> getStudentCourses(String email);
}

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(
        name = "student_courses",
        joinColumns = @JoinColumn(name = "student_email"),
        inverseJoinColumns = @JoinColumn(name = "courses_id")
    )
    private Set<Course> courses = new HashSet<>();

    // Constructors
    public Student() {}

    public Student(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    // Getters and Setters
    // toString, equals, and hashCode methods (without collections in toString)
}