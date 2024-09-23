package com.generation;

import com.generation.classes.StudentService;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
	    studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1020", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );
	    
        studentService.enrollStudents( "Math", "1030");
        studentService.enrollStudents( "Math", "1020");
        
        studentService.enrollStudents( "History", "1040");
        studentService.enrollStudents( "History", "1050");
        
//        studentService.students.put( "1050", new Student( "Elise", "1020", 26 ) );
//        studentService.students.put( "1020", new Student( "Santiago", "1020", 33 ) );

        studentService.showAllCourses();
        studentService.showEnrollStudents("Math");
        studentService.showEnrollStudents("History");
    }//main
}//class Main