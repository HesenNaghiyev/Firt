package ada.wm2.jpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.List;

@JsonPropertyOrder
        ({"courseID", "coursename","courselevel", "prerequisite", "students"})

@Data
@Entity
@Table(name = "Courses")
public class Course {
     @Id
    @Column(name = "Course_ID")
     @NotNull(message="Please Enter Integer Value ")
     @Positive(message = " Please Enter Positive Integer")
     //    l am checking for all negative inputs
    Integer CourseID;

    @NotBlank
    @Size(min=5, max = 30)
      String Coursename;

    @Column(name = "Course_level")
     @NotBlank
     @Size(min=2, max = 30)
      String Courselevel;

    @NotBlank
    @Size(min=2, max = 5)
      String prerequisite;


  @ManyToMany(mappedBy = "courses")
  @ToString.Exclude
     @JsonIgnore
     List<Student> students;

    public Integer getCourseID() {
        return CourseID;
    }

    public void setCourseID(Integer courseID) {
        CourseID = courseID;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public String getCourselevel() {
        return Courselevel;
    }

    public void setCourselevel(String courselevel) {
        Courselevel = courselevel;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
