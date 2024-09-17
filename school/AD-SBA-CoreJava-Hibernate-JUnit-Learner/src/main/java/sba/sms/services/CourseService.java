package sba.sms.services;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sba.sms.dao.CourseI;
import sba.sms.models.Course;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseService is a concrete class. This class implements the
 * CourseI interface, overrides all abstract service methods and
 * provides implementation for each method.
 */
public class CourseService {
    private final CourseDAO courseDAO = new CourseDAO();

    public void addCourse(int id, String name, String instructor) {
        Course course = new Course(id, name, instructor);
        courseDAO.createCourse(course);
    }

    // Implement other service methods
}
