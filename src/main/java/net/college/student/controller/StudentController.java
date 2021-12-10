package net.college.student.controller;

import net.college.student.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    /* http://localhost:8080/student */
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Vuqar", "Aliyev");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amin", "Budaverdy"));
        students.add(new Student("Tural", "Caniyev"));
        students.add(new Student("Murshud", "Haqverdiyev"));
        students.add(new Student("Mahmud", "Aliyev"));
        students.add(new Student("Rovshen", "Cudarov"));
        return students;
    }


    /* @PathVariable annotation  http://localhost:6931/student/1  */
    @GetMapping("/student/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    /* build rest API to handle query parameters
     http://localhost:8080/student/query?firstName=Ramesh&lastName=Fadatare */
    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }



}
