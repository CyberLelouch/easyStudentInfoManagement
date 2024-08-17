package indiv.java.controller;

import indiv.java.entity.Student;
import indiv.java.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();
    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待添加学生的学号：");
        String studentId = scanner.nextLine();
        System.out.println("请输入姓名：");
        String studentName = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        int studentAge = scanner.nextInt();

        //封装数据
        Student student = new Student(studentId,studentName,studentAge);
        //如何待添加学生不存在，添加
        if ( ! studentService.isExist(studentId)){
            if (studentService.addStudent(student)){
                System.out.println(student.getId()+"添加成功");
            }else {
                System.out.println("添加失败");
            }
        }else {
            System.out.println(student.getId()+"已存在，添加失败");
        }
    }

    //通过学号删除学生
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待删除的学生学号：");
        String studentId = scanner.nextLine();
        if (studentService.isExist(studentId)){
            if (studentService.deleteStudent(studentId)){
                System.out.println(studentId+"删除成功！");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("删除失败，"+studentId+"不存在。");
        }
    }

    //根据学号修改学生信息
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待修改的学生学号：");
        String studentId = scanner.nextLine();
        if (studentService.isExist(studentId)){

            System.out.println("请输入姓名：");
            String studentName = scanner.nextLine();
            System.out.println("请输入学生年龄：");
            int studentAge = scanner.nextInt();

            //封装数据
            Student student = new Student(studentId,studentName,studentAge);

            if (studentService.updateStudent(studentId,student)){
                System.out.println(studentId+"修改成功！");
            }
        }else {
            System.out.println(studentId+"不存在！");
        }
    }

    //根据学号查看学生信息
    public void findStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待查找的学生学号：");
        String studentId = scanner.nextLine();
        if (studentService.isExist(studentId)){
            Student student = studentService.findStudent(studentId);
            if (student != null){
                System.out.println(student);
            }else {
                System.out.println("学生不存在！");
            }
        }else {
            System.out.println(studentId+"不存在！");
        }
    }

    public void showAllStudentInfo() {
        ArrayList<Student> students = studentService.allStudentInfo();
        if (students != null){
            students.forEach(System.out::println);
        }
    }
}
