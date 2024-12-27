package mistake;

class ageE extends Exception{
    public ageE (String i){
        super(i);
    }

}
public class them {
    public static void main(String[] args) {
        int a = -10;
        try{
            if(a<0){
            throw new ageE("mistake");
        }
        }catch(ageE c) {
            System.out.println(c.getMessage());
        }
        
    }

}
