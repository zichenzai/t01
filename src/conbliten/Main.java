package conbliten;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("学生管理系统");
            System.out.println("1. 添加学生");
            System.out.println("2. 显示所有学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 退出");
            System.out.print("请选择操作: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1:
                    System.out.print("输入学生姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("输入学生ID: ");
                    int id = scanner.nextInt();
                    manager.addStudent(name, id);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.print("输入要删除的学生ID: ");
                    int removeId = scanner.nextInt();
                    manager.removeStudent(removeId);
                    break;
                case 4:
                    System.out.println("退出系统。");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("无效选择，请重新选择。");
            }
        }
    }
}

