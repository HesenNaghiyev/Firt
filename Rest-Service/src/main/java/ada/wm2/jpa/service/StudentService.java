package ada.wm2.jpa.service;


import ada.wm2.jpa.dto.StudentDTO;
import ada.wm2.jpa.entity.Student;
import ada.wm2.jpa.mapper.StudentMapper;
import ada.wm2.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
       try {
           studentRepository.save(student);
           return "student added";
       }
       catch (Exception ex){
           return "error occured"+ ex.getMessage();
       }

    }

    public StudentDTO getSudentWithID(Integer id){
        Optional<Student> result = studentRepository.findById(id);
      StudentDTO studentDTO = null;
       if (result.isPresent()){
           Student student=result.get();
            studentDTO= StudentMapper.INSTANCE.getStudentDTO(student);
        }
       return studentDTO;
    }

    public List<StudentDTO> getListofStudent(){
        Iterable<Student> students =studentRepository.findAll();
        List<StudentDTO> dtoList =StudentMapper.INSTANCE.getListLikeDTO(students);
        return dtoList;
    }
}
