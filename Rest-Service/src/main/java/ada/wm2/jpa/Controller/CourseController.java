package ada.wm2.jpa.Controller;


import ada.wm2.jpa.dto.CourseDTO;
import ada.wm2.jpa.dto.StudentDTO;
import ada.wm2.jpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<CourseDTO> getCourseByID(@PathVariable Integer id){
        CourseDTO courseDTO =courseService.getCourseByID(id);
        if (courseDTO==null){
            return new ResponseEntity<CourseDTO>(courseDTO, HttpStatus.BAD_REQUEST);
        }
        else {
            return new ResponseEntity<CourseDTO >(courseDTO, HttpStatus.OK);
        }
    }



    @GetMapping("/list")
    public ResponseEntity<List<CourseDTO>> getCourseList(){
        List<CourseDTO> dtoList =courseService.getListofCourses();
        return new ResponseEntity<List<CourseDTO>>(dtoList, HttpStatus.OK);

    }
}
