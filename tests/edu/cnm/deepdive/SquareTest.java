package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class SquareTest {

  @Test
  void isPerfect() {
    assertFalse(Square.isPerfect(5));
    assertTrue(Square.isPerfect(4));
    assertFalse(Square.isPerfect(24));
    assertFalse(Square.isPerfect(26));
    assertFalse(Square.isPerfect(99));
  }

  @Test
  void isPerfectException() {
    assertThrows(IllegalArgumentException.class, ()->Square.isPerfect(-1));
    assertThrows(IllegalArgumentException.class, ()->Square.isPerfect(-10));
    assertThrows(IllegalArgumentException.class, ()->Square.isPerfect(-110031234));
    assertThrows(IllegalArgumentException.class, ()->Square.isPerfect(-55));
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        Square.isPerfect(-10);
      }
    });

  }
}