import java.util.Scanner;

public class Player {
    protected String name;
    protected char symbol;
    public Player(){};
    public Player(String Name, char Symbol){
        name = Name;
        symbol = Symbol;
    }
    public int[] getMove(){
        int[] arr = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.printf(name+", please enter your move: ");
        arr[0] = input.nextInt();
        arr[1] = input.nextInt();
        return arr;
    }
    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }

    public void setName(String name){
        this.name = name;
    }
    public  void setSymbol(char symbol){
        this.symbol = symbol;
    }
}
