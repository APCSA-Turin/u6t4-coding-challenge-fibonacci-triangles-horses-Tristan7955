package com.example.project;

public class Point {
  private int x;
  private int y;
  
  public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }
  
  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }
  public double distanceTo(Point other) {
      return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
  }

  public String pointInfo() {
      return "(" + x + ", " + y + ")";
  }
}
