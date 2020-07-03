package ada.wm2.jpa.repository;

import ada.wm2.jpa.entity.Course;
import ada.wm2.jpa.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, Integer> {


}
