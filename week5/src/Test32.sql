select sno,score from choose
where CourseID = 'C1' and score < (select score from student,choose where student.sno = choose.sno and student.name = '张三' and CourseID = 'C1' );