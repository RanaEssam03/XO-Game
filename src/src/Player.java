import java.util.Scanner;

public class Player {
    protected String name;
    protected char symbol;
    public Player(String Name, char Symbol){
        name = Name;
        symbol = Symbol;
    }
    public void getMove(int x , int  y){
        Scanner input = new Scanner(System.in);
        System.out.printf(name+", please enter your move: ");
        x = input.nextInt();
        y = input.nextInt();
    }
    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }
}
