package com.generation;

public class CourseNotFoundException extends Exception{

    public CourseNotFoundException(String message){
        super("Course not found!! [" + message + "]");
    }//constructor
}//class CourseNotFoundException