package mistake;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {
    public static void dajd() throws InputMismatchException {
       int a = 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        try{
            int b  = sc.nextInt();
            if (b<=7){
                System.err.println("星期"+b);
            }else{
                System.err.println("你输入的数大于7");
            }
        }catch( InputMismatchException ex){
            System.err.println("请输入整行");

        }catch(Exception ex){
            System.err.println("未知错误");
        }
        finally{
            System.err.println("没有错误");
        }
        dajd();
        


        

        
    }
    
}
