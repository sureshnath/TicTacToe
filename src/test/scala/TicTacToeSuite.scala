package com.example.ttt

import org.scalatest.funsuite.AnyFunSuite

class TicTacToeSuite extends AnyFunSuite{
  test("An empty board test") {
    val board = new TicTacToe()
    board.board = Array(Array(' ',' ',' '),Array(' ',' ',' '),Array(' ',' ',' '))
    assert(board.result().equals("no winner"))
  }
}
