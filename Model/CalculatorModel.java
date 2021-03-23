package Model;

public class CalculatorModel {
    private int res=0;
    private int number=0 ;
    private int dau=0;
    public void reset(){
        res = 0;
        number = 0;
        dau = 0;
    }
    public void setDau(char x){
        if (dau == 0 ) res += number;else res-=number;
        number = 0;
        if (x=='+') dau = 0;
        else dau = 1;
    }
    public void setNumber(char x){
        number = number*10 + (x - '0');
    }
    public int getRes() {
        if (dau == 0 ) res += number;else res-=number;

        return  res;
    }
}
