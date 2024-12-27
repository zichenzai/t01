package JiHeKuanJia;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class nlist1 {
    public static void main(String[] args) {
        LinkedList<bookDate> l = new LinkedList<bookDate>();
        Set s1 = new HashSet();
        
        bookDate b1 = new bookDate("三体",25);
        bookDate b2 =new bookDate("龙族",99);
        bookDate b3 =new bookDate("龙族",1);
        l.add(b1);
        l.add(b2);
        l.add(b2);
        l.addFirst(b3);//第一个元素

        l.add(0, b1);

        l.remove();//默认情况删除0项数据

        // l.set(1, "dada");

        s1.addAll(l);

        for (Object x : s1){
            System.out.println(x);

        }
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i)+"个数是"+l.size());

        }


    }

}
