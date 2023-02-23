#include <string>

class Player {
public:
    Player(std::string name, char symbol);

    std::string getName() const;

    char getSymbol() const;

private:
    std::string name;
    char symbol;
};
