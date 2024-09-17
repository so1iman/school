package sba.sms.dao;

import sba.sms.models.Course;
import sba.sms.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CourseDAO implements CourseI {
    @Override
    public void createCourse(Course course) {
        // Implement method to create a course
    }

    @Override
    public List<Course> getAllCourses() {
        // Implement method to retrieve all courses
    }

    @Override
    public Course getCourseById(int courseId) {
        // Implement method to retrieve a course by ID
    }
}
