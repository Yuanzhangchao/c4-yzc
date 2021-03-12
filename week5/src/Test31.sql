select * from student
where College = (select College from student where name = '张三')
  and exists (select * from student where name = '张三');