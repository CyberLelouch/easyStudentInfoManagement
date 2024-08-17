package indiv.java.dao;

import indiv.java.entity.Student;

import java.util.ArrayList;

public class StudentDao {
    private static ArrayList<Student> students = new ArrayList<>();

    //判断当前学生是否在数据库中
    public boolean isExist(String studentId){
        for (Student student : students){
            if (student.getId().equalsIgnoreCase(studentId)){
                return true;
            }
        }
        return false;
    }



    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public boolean deleteStudent(String studentId) {
        for (Student student : students){
            if (student.getId().equalsIgnoreCase(studentId)){
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public boolean updateStudent(String studentId,Student student) {
        //获取下标
        int index =0;
        for (Student student1 : students){
            if (student1.getId().equalsIgnoreCase(studentId)){
                index = students.indexOf(student1);
            }
        }
        students.set(index,student);
        return true;
    }

    public Student findStudent(String studentId) {
        for (Student student : students){
            if (student.getId().equalsIgnoreCase(studentId)){
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> allStudentInfo() {
        return students;
    }
}
