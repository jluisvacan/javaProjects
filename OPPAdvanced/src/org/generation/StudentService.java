package org.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {
    HashMap<String, Course> courseList = new HashMap<>();
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService() {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }//constructor

    public void addStudent(Student student) {
    	students.put(student.getId(),student);
    }//addStudent
    
    public void enrollStudents( String courseName, String studentID ) {
        Course course = courseList.get( courseName );
        if ( !coursesEnrolledByStudents.containsKey( studentID ) ) {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }
    
    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );
        if ( coursesEnrolledByStudents.containsKey( studentID ) ) {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){
    	for (String key : coursesEnrolledByStudents.keySet()) {
    		List<Course> cursos = coursesEnrolledByStudents.get(key);
    		System.out.println(key);
    		for (Course course : cursos) {
    			// System.out.println(course);
    			if (course.getName().equals(courseId))
//    				System.out.println(students.get(key));
    				System.out.println(key);
    		}//forEachCursos
    		
    	}//forEachStudents	
    }//showEnrolledStudents

    public void showAllCourses(){
        for (String courseId : courseList.keySet()) {
        	System.out.println(courseList.get(courseId));
        }// forEachCourseList
    }
}