package ru.pft.sandbox;

public class MyFirstProgramm {
    public static void main(String[] args) {

      hello("world");
      hello("user");
      hello("Alexei");

      Square s = new Square(5);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4,6);
      System.out.println("Площадь рпрямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {

      System.out.println("Hell, " + somebody + "!");
    }

}
