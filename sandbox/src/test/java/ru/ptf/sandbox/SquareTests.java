package ru.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pft.sandbox.Square;


/**
 * Created by Солнышко on 30.01.2017.
 */
public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
