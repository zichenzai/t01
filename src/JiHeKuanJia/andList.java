package JiHeKuanJia;
import java.util.ArrayList;
public class andList {
    public static void main(String[] args) {
        ArrayList mm = new ArrayList();
        bookDate b1 = new bookDate("你是人",10);
        bookDate b2 = new bookDate("你是人",20);
        bookDate b3 = new bookDate("你是人",1);
        mm.add(b1);
        mm.add(b2);
        mm.add(1,b3);
        mm.remove(0);
        mm.remove(b2);
        System.out.println(mm.contains(b2));
        for (int i =0; i<mm.size(); i++){
            System.out.println(mm.get(i));
        }

    }
}
