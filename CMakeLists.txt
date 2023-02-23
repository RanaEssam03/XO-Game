cmake_minimum_required(VERSION 3.24)
project(xo_chat_gpt)

set(CMAKE_CXX_STANDARD 17)

add_executable(xo_chat_gpt main.cpp game.cpp game.h board.cpp board.h player.cpp player.h)
