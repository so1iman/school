package sba.sms.dao;

import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO implements StudentI {
    @Override
    public void createStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        // Implement code to retrieve all students
    }

    @Override
    public Student getStudentByEmail(String email) {
        // Implement code to get a student by email
    }

    @Override
    public boolean validateStudent(String email, String password) {
        // Implement code to validate a student
    }

    @Override
    public void registerStudentToCourse(String email, int courseId) {
        // Implement code to register a student to a course
    }

    @Override
    public List<Course> getStudentCourses(String email) {
        // Implement code to get all courses for a student
    }
}
