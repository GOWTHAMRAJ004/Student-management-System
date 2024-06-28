package com.gowtham.Students;

import com.gowtham.Students.service.IStudentlogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/* these is basically a controller layer it will get the data from the end application and send the data
base which means the service layer it contain all the business login and after the service getting the data
it will manipulate the data and it need to store the data in the database , all the database ready and write \
jobs are done by the  dao layer which means peristaltic layer so we will use the function in the service yer
so these is the whole process
 */
@RestController
@RequestMapping("/api")
public class Studentset {
    @Autowired
    private IStudentlogic studentService1;
   @PostMapping("/students")
    public datacontroller regisyration(@RequestBody datacontroller data) {
        System.out.println("the was data was getted in is" + data);
       studentService1.savestudents(data);
        return data;
    }
    @GetMapping("/studentData")
    public List<datacontroller> getStudentDate(){
       /*
       see in the react application they will request data so we use get method to return a List of student
       from the data we will request data from dae later and using service we will write a business logic
        */
        // invoke service method responsible to rettrive the student data

       return studentService1.getAll();
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<datacontroller> StudentBasedId(@PathVariable Integer id){
       // invoke service method responsible to rettrive the student data of patricular student
        datacontroller data = studentService1.getDetailsById(id);
        return ResponseEntity.ok(data);
    }
    @DeleteMapping("/studentes/{id}")
    public ResponseEntity<datacontroller> deleteStudentId(@PathVariable Integer id){
        // invoke service method responsible to delete the particular student id
        // see i shoud delete id and iam send the response with header and resposebody
        studentService1.deleteStudentId(id);
        return  ResponseEntity.noContent().build();
    }
}
