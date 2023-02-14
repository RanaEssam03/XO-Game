// @Auther: Rana Essam 20210133
// Created on 14/2/2023
// Description: this is the game_manager class  which
// integrates board class and player class to run the game


import java.util.Scanner;


public class GameManager {
    GameManager(){
    }
    public void run(){
        System.out.println("\t WELCOME TO XO GAME!!");

        Board board = new Board(3);
        Scanner myObject = new Scanner(System.in);
        Player [] players = {new Player(), new Player()};
        for (int i = 0; i<2 ; i++)
        {
            System.out.print("Player" + (i+1) +", plz enter your\n-Name:\t");
            String name = myObject.nextLine();
            players[i].setName(name);
            System.out.print("-Symbol:\t");
            String symbol =  myObject.nextLine();
            players[i].setSymbol(symbol.charAt(0));
            System.out.println();
        }

        boolean flag = false;
        boolean draw = false;
        int winner= 0;

        do {

            for (int i = 0; i < 2; i++) {
                board.display_board();
                int[] move = new int[2];
                move = players[i].getMove();
                while (!board.update_board(move[0], move[1], players[i].symbol)) {
                    move = players[i].getMove();
                }
                if (board.is_winner()) {
                    flag = true;
                    winner = i;
                    break;
                }
                if (board.is_draw()) {
                    flag = true;
                    draw = true;
                    break;
                }
                System.out.println();

            }
        } while (!flag);

        if(draw){
            System.out.println("---------------------------------------------------------");
            System.out.println("\tDRAW GAME");
            return;
        }
        board.display_board();
        System.out.println("\t" + players[winner].getName() + " is the WINNER!");
        return;
    }
}
