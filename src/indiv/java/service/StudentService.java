package indiv.java.service;

import indiv.java.dao.StudentDao;
import indiv.java.entity.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    //判断学生是否在数据库中
    public boolean isExist(Student student){
        return studentDao.isExist(student);
    }
    //添加学生
    public boolean addStudent(Student student){
        return studentDao.addStudent(student);
    }
}
