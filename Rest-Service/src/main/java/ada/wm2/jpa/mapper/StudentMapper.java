package ada.wm2.jpa.mapper;


import ada.wm2.jpa.dto.StudentDTO;
import ada.wm2.jpa.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDTO getStudentDTO(Student student);

    List<StudentDTO> getListLikeDTO(Iterable<Student> students);
}
