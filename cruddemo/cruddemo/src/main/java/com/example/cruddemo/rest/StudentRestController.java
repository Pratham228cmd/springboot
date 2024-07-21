package com.example.cruddemo.rest;

import com.example.cruddemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Pratham","patel"));
        theStudents.add(new Student("rahul","sehgal"));
        theStudents.add(new Student("sourav","singh"));

    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if(studentId>= theStudents.size() || studentId<0){
            throw new StudentNotFoundException("student not found- "+ studentId);
        }
        return theStudents.get(studentId);
    }

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex){
//        StudentErrorResponse error=new StudentErrorResponse();
//        error.setMessage(ex.getMessage());
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setTimeStamp(System.currentTimeMillis());
//        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception ex){
//        StudentErrorResponse error=new StudentErrorResponse();
//        error.setMessage(ex.getMessage());
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setTimeStamp(System.currentTimeMillis());
//        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
//    }

}
