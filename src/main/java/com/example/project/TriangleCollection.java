package com.example.project;

public class TriangleCollection {

  private Triangle[] collection;

  public TriangleCollection(int numTriangles, int startX, int startY) {
      collection = new Triangle[numTriangles];
      Point p1 = new Point(-startX, 0);
      Point p2 = new Point(0, startY);

      for (int i = 0; i < numTriangles; i++) {
          Point p3 = new Point(startX - i, 0);
          collection[i] = new Triangle(p1, p2, p3);
      }
  }

  public double totalPerimeter() {
      double sum = 0;
      for (Triangle triangle : collection) {
          sum += triangle.perimeter();
      }
      return sum;
  }

  public void shiftTriangles(int increment) {
      for (Triangle triangle : collection) {
          for (Point vertex : triangle.getVertices()) {
              vertex.setX(vertex.getX() + increment);
              vertex.setY(vertex.getY() + increment);
          }
      }
  }

  public String triangleCollectionInfo() {
      StringBuilder sb = new StringBuilder();
      for (Triangle triangle : collection) {
          sb.append(triangle.triangleInfo()).append("\n");
      }
      return sb.toString().trim();
  }
}
