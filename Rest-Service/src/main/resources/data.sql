INSERT INTO Students(Student_ID,First_Name,Last_Name,Country,Gpa,password)VALUES (1, 'Hasan', 'Naghiyev', 'Azerbaijan', 4.0, 'hesen1234');
INSERT INTO Students(Student_ID,First_Name,Last_Name,Country,Gpa,password) VALUES (2, 'Subhan', 'Naghiyev','Azerbaijan', 3.5, 'subhan123');
INSERT INTO Students(Student_ID,First_Name,Last_Name,Country,Gpa,password) VALUES (3, 'Xanlar', 'Naghiyev','Azerbaijan', 2.7, 'xanlar1234');
INSERT INTO Students(Student_ID,First_Name,Last_Name,Country,Gpa,password) VALUES (4, 'Mustafa', 'Naghiyev','Azerbaijan', 3.9, 'mustafa123');
INSERT INTO Students(Student_ID,First_Name,Last_Name,Country,Gpa,password) VALUES (5, 'Camal', 'Naghiyev','Azerbaijan', 3.6, 'camal123123');


INSERT INTO Courses(Course_ID, Coursename, Course_level, prerequisite) VALUES (102, 'Web and Mobile 2', 'Hard', 'yes');
INSERT INTO Courses (Course_ID, Coursename, Course_level, prerequisite) VALUES (103, 'Cyber Security', 'Hard', 'no' );
INSERT INTO Courses (Course_ID, Coursename, Course_level, prerequisite) VALUES(104, 'System Analysis and Design', 'Normal', 'no');
INSERT INTO Courses (Course_ID, Coursename, Course_level, prerequisite) VALUES(105, 'Probability and Statics', 'Normal', 'yes');


INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(1, 104);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(1, 105);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(2, 103);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(2, 102);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(3, 104);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(3, 103);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(4, 102);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(4, 103);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(5, 102);
INSERT INTO Courses_Students(Student_ID,Course_ID) VALUES(5, 103);







