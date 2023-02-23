#include "board.h"
#include <iostream>

Board::Board() {
    board.resize(BOARD_SIZE, std::vector<char>(BOARD_SIZE, '-'));
}

bool Board::make_move(int row, int col, char symbol) {
    if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
        return false;
    }
    if (board[row][col] != '-') {
        return false;
    }
    board[row][col] = symbol;
    return true;
}

bool Board::has_winner() const {
    for (int i = 0; i < BOARD_SIZE; i++) {
        // Check rows
        if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
            return true;
        }
        // Check columns
        if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
            return true;
        }
    }
    // Check diagonals
    if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        return true;
    }
    if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
        return true;
    }
    return false;
}

bool Board::is_board_full() const {
    for (int i = 0; i < BOARD_SIZE; i++) {
        for (int j = 0; j < BOARD_SIZE; j++) {
            if (board[i][j] == '-') {
                return false;
            }
        }
    }
    return true;
}

void Board::print_board() const {
    for (int i = 0; i < BOARD_SIZE; i++) {
        for (int j = 0; j < BOARD_SIZE; j++) {
            std::cout << board[i][j] << " ";
        }
        std::cout << std::endl;
    }
}
