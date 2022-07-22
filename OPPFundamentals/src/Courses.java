import java.util.ArrayList;

public class Courses {

String courseName;
String profesorName;
int year;
ArrayList<Student> students = new ArrayList<Student>();

public void enroll(Student student){
    students.add(student);
 }//enroll
public void enroll(Student[] student) {
	for (Student student : students) {
		enroll(student);
	}//forEach
}//enroll

 public void unEnroll(Student student){
     if (students.contains(student)) {
		 students.remove(student);
	 }//if
 }//unEnrrolls

 public int countStudents(){
     return students.size();
 }//countStudents
 
 public int bestGrade(){
     int grade = 0;
     for(Student student : students) {
    	 grade = (student.grade>grade)?student.grade:grade;
     }//for
	 return grade;
 }//bestGrade
}//classCountStudents
