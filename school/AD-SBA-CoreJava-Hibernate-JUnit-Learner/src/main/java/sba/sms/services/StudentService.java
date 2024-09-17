package sba.sms.services;

import lombok.extern.java.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * StudentService is a concrete class. This class implements the
 * StudentI interface, overrides all abstract service methods and
 * provides implementation for each method. Lombok @Log used to
 * generate a logger file.
 */

 package sba.sms.services;

 import sba.sms.dao.StudentDAO;
 import sba.sms.models.Student;
 
 public class StudentService {
     private final StudentDAO studentDAO = new StudentDAO();
 
     public void registerStudent(String email, String name, String password) {
         Student student = new Student(email, name, password);
         studentDAO.createStudent(student);
     }
 
     
 }
 
