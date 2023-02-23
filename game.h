#ifndef GAME_H
#define GAME_H

#include "board.h"
#include "player.h"

class Game : public Board {
public:
    // Constructor that takes in the name and symbol for each player
    Game(std::string player1_name, char player1_symbol, std::string player2_name, char player2_symbol);

    // Public function to start and play the game
    void play_game();

private:
    // Array of Player objects to keep track of each player
    Player players[2];
};

#endif // GAME_H
