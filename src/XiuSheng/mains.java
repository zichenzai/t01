package XiuSheng;

import java.util.Scanner;

public class mains {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);
        pupil p1 =new pupil("dada",1);
        pupilSecretary s1 = new pupilSecretary();
        s1.l1.add(p1);
        s1.fun();
        
    }
    



}
