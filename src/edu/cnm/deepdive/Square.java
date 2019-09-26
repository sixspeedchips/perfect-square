package edu.cnm.deepdive;

public class Square {




  public static boolean isPerfect(int value) throws IllegalArgumentException{
    boolean isSquare = false;

    if(value < 0){
      throw new IllegalArgumentException();
    }
    int roundRoot = (int) Math.sqrt(value);
    return roundRoot * roundRoot == value;
  }
}
