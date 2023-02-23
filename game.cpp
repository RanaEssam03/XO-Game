#include "game.h"
#include <iostream>

// Constructor that initializes the players array with the input names and symbols
Game::Game(std::string player1_name, char player1_symbol, std::string player2_name, char player2_symbol)
        : players{{player1_name, player1_symbol}, {player2_name, player2_symbol}} {}

// Public function to start and play the game
void Game::play_game() {
    int current_player = 0;
    // Loop until the board is full or there is a winner
    while (!is_board_full() && !has_winner()) {
        std::cout << "It's " << players[current_player].getName() << "'s turn." << std::endl;
        print_board();
        int row, col;
        // Keep prompting the current player for a valid move until they make one
        do {
            std::cout << "Enter row (1-3) and column (1-3) separated by a space: ";
            std::cin >> row >> col;
            row--; col--;  // Convert to zero-indexed
        } while (!make_move(row, col, players[current_player].getSymbol()));
        // Switch to the other player for the next turn
        current_player = (current_player + 1) % 2;
    }
    print_board();
    // Output the winner or a tie message
    if (has_winner()) {
        std::cout << "Congratulations, " << players[(current_player + 1) % 2].getName() << " has won!" << std::endl;
    } else {
        std::cout << "It's a tie!" << std::endl;
    }
}
