package indiv.java.service;

import indiv.java.dao.StudentDao;
import indiv.java.entity.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    //判断学生是否在数据库中
    public boolean isExist(String studentId){
        return studentDao.isExist(studentId);
    }
    //添加学生
    public boolean addStudent(Student student){
        return studentDao.addStudent(student);
    }

    public boolean deleteStudent(String studentId) {
        return studentDao.deleteStudent(studentId);
    }

    public boolean updateStudent(String studentId,Student student) {
        return studentDao.updateStudent(studentId,student);
    }
}
