package ada.wm2.jpa.mapper;


import ada.wm2.jpa.dto.CourseDTO;
import ada.wm2.jpa.dto.StudentDTO;
import ada.wm2.jpa.entity.Course;
import ada.wm2.jpa.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDTO getCourseDTO(Course course);

    List<CourseDTO> getDTOList(Iterable<Course> courses);


}
