package ada.wm2.jpa.service;


import ada.wm2.jpa.dto.CourseDTO;
import ada.wm2.jpa.dto.StudentDTO;
import ada.wm2.jpa.entity.Course;
import ada.wm2.jpa.entity.Student;
import ada.wm2.jpa.mapper.CourseMapper;
import ada.wm2.jpa.mapper.StudentMapper;
import ada.wm2.jpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

@Autowired
CourseRepository courseRepository;


    public CourseDTO getCourseByID(Integer id){
        Optional<Course> result = courseRepository.findById(id);
        System.out.println("Course"+ result.get().getCoursename());
        CourseDTO courseDTO = null;
        if (result.isPresent()){
            Course course=result.get();
            courseDTO= CourseMapper.INSTANCE.getCourseDTO(course);
        }
        return courseDTO;
    }

    public List<CourseDTO> getListofCourses(){
        Iterable<Course> courses =courseRepository.findAll();
        List<CourseDTO> dtoList =CourseMapper.INSTANCE.getDTOList(courses);
        return dtoList;
    }
}
