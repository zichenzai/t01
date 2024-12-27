package XiuSheng;

public class pupil {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getFormer() {
        return former;
    }
    public void setFormer(int former) {
        this.former = former;
    }
    private int former = 0000;

    public pupil(){}
    public pupil(String name,int age){
        former++;
        this.age = age;
        this.name = name;
    }
}
