package conbliten;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        students.add(student);
        System.out.println("添加成功: " + student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("没有学生记录。");
            return;
        }
        System.out.println("学生列表:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("删除成功: " + student);
                return;
            }
        }
        System.out.println("未找到ID为" + id + "的学生。");
    }
}

