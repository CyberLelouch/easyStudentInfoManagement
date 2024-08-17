package indiv.java.dao;

import indiv.java.entity.Student;

import java.util.ArrayList;

public class StudentDao {
    private static ArrayList<Student> students = new ArrayList<>();

    //判断当前学生是否在数据库中
    public boolean isExist(Student student){
        return students.contains(student);
    }



    public boolean addStudent(Student student) {
        return students.add(student);
    }
}
