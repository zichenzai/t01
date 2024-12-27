package conbliten;

public class Student {
        private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "学生姓名: " + name + ", 学生ID: " + id;
    }
}

