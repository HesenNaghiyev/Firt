package ada.wm2.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Data
@Entity
@Table(name = "Students")
public class Student {
    @Id

    @Column(name = "Student_ID")
    @NotNull(message="Please Enter Integer Value ")
    @Positive(message = " Please Enter Positive Integer")
//    l am checking for all negative inputs
    Integer id;

    @Column(name = "First_Name")
    @NotBlank
    @Size(min=3, max = 30)
    String firstname;



    @Column(name = "Last_Name")
    @NotBlank
    @Size(min=3, max = 30)
    String lastname;



    @Column(name = "Country")
    @NotBlank
    @Size(min=3, max = 30)
     String country;



    @Column(name = "Gpa")
    @Min(0)
    @Max(4)
    double gpa;

    String password;

    @ManyToMany
    @JoinTable(name = "Courses_Students",
            joinColumns = @JoinColumn(name = "Student_ID"),

            inverseJoinColumns = @JoinColumn(name = "Course_ID"))
            @ToString.Exclude

            @JsonIgnore
         List<Course> courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
