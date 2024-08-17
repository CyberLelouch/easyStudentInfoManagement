package indiv.java.application;

import indiv.java.controller.StudentController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //创建StudentController对象
        StudentController studentController = new StudentController();
        System.out.println("++++欢迎来到教务管理系统++++");
        while (true){
            System.out.println("\t1.添加学生");
            System.out.println("\t2.删除学生");
            System.out.println("\t3.通过学号更新学生信息");
            System.out.println("\t4.通过学号查看学生信息");
            System.out.println("\t5.显示所有学生");
            System.out.println("\t6.退出");
            System.out.println("请输入操作：");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    //添加学生
                    studentController.addStudent();
                    break;
                case 2:
                    //删除学生
                    studentController.deleteStudent();
                    break;
                case 3:
                    //通过学号更新学生信息
                    studentController.updateStudent();
                    break;
                case 4:
                    //通过学号查看学生信息
                    studentController.findStudent();
                    break;
                case 5:
                    //显示所有学生信息
                    studentController.showAllStudentInfo();
                    break;
                case 6:
                    //退出
                    System.exit(0);
                default:
                    System.out.println("非法输入，请重新输入！");
                    break;
            }
        }
    }
}
