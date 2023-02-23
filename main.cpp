#include "game.h"
#include <iostream>

int main() {
    std::string player1_name, player2_name;
    char player1_symbol, player2_symbol;
    std::cout << "Enter Player 1's name: ";
    std::cin >> player1_name;
    std::cout << "Enter Player 1's symbol (X or O): ";
    std::cin >> player1_symbol;
    std::cout << "Enter Player 2's name: ";
    std::cin >> player2_name;
    std::cout << "Enter Player 2's symbol (X or O): ";
    std::cin >> player2_symbol;
    Game game(player1_name, player1_symbol, player2_name, player2_symbol);
    game.play_game();
    return 0;
}

