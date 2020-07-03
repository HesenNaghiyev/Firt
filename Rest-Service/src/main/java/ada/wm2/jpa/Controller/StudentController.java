package ada.wm2.jpa.Controller;



import ada.wm2.jpa.dto.StudentDTO;
import ada.wm2.jpa.entity.Student;
import ada.wm2.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-update")
    public ResponseEntity<String> addOrUpdateStudent(@RequestBody Student student){
        String result= studentService.addStudent(student);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <StudentDTO> getStudentByID(@PathVariable Integer id){
       StudentDTO studentDTO =studentService.getSudentWithID(id);
       if (studentDTO==null){
           return new ResponseEntity<StudentDTO>(studentDTO, HttpStatus.BAD_REQUEST);
       }
       else {
           return new ResponseEntity<StudentDTO >(studentDTO, HttpStatus.OK);
       }
    }

    @GetMapping("/list")
    public ResponseEntity<List<StudentDTO>> getStudentList(){
       List<StudentDTO> dtoList =studentService.getListofStudent();
       return new ResponseEntity<List<StudentDTO>>(dtoList, HttpStatus.OK);

    }
}
