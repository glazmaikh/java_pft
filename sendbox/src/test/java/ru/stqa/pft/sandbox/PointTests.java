package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PointTests {

  @Test
  public void distance0Test() {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(2,2);
    assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void distancePositiveTest() {
    Point p1 = new Point(2, 4);
    Point p2 = new Point(2,6);
    assertEquals(p1.distance(p2), 2.0);
  }
}
