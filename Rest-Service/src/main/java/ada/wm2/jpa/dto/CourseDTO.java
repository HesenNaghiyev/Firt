package ada.wm2.jpa.dto;

import ada.wm2.jpa.entity.Student;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder
        ({"courseID", "coursename","courselevel", "prerequisite", "students"})


public class CourseDTO {

    Integer CourseID;

    String Coursename;

    String Courselevel;

    String prerequisite;

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
