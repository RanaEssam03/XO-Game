#include <vector>

class Board {
public:
    Board();

    bool make_move(int row, int col, char symbol);

    bool has_winner() const;

    bool is_board_full() const;

    void print_board() const;

private:
    static const int BOARD_SIZE = 3;
    std::vector<std::vector<char>> board;
};
