select student.SNO,Name,CourseName,score from student,choose,course
where student.SNO = choose.SNO and choose.CourseID = course.CourseID;