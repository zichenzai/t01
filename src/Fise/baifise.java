package Fise;
public class baifise extends fise {
    baifise(int speed){
        this.speed = speed;
    }
    baifise(){}
    @Override
    public int celc(int hours) {
        return hours * speed;
    }
}