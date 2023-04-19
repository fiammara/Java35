package tasks;

public class TriangleClassCall {
    public static void main(String[] args) {
      Triangle triangle1 = new Triangle ();
      triangle1.setSide1(2.0);
      triangle1.setSide2(3.0);
      triangle1.setSide3(8.0);


      Triangle triangle2 = new Triangle ();
      triangle2.setSide1(12.0);
      triangle2.setSide2(13.0);
      triangle2.setSide3(8.0);

      triangle1.areaTriangle();
      triangle2.areaTriangle();
    }
}
