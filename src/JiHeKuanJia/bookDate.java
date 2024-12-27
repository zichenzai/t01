package JiHeKuanJia;

public class bookDate {
    private String book;
    private int manght; 
    public bookDate(){

    }
    public bookDate(String book ,int manght){
        if (manght <100){
            this.book = book;
            this.manght = manght;
        }else{
            throw new IllegalArgumentException("错误的是这‘"+book+"’"); 
        }
    }


    @Override
    public String toString() {
        return "数据是{name='" + this.book + "', value=" + this.manght + "}";
    }
}


