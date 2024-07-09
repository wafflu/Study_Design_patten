package p14_Chain_of_Responsibility;

public class Trouble {
    private int number;
    
    public Trouble(int number){
        this.number = number;
    }
    
    public int getNumber(){
        return number;
    }
    
    @Override
    public String toString(){
        return "[Trouble "+number+"]";
    }
}
