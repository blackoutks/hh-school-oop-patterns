package ru.hh.school.ooppatterns.structural.adapter.problem;

import java.time.Duration;
import java.time.Instant;

public class LaserBurner {

  public void turnOn() {
    System.out.println("Turning on the laser");
  }

  public void preheat() {
    System.out.println("Preheating the laser");
  }

  public Duration burn(char[] data) throws Exception {
    if (data.length == 0) {
      throw new Exception("Cannot burn empty data");
    }

    Instant start = Instant.now();

    System.out.println("Laser burning: " + String.valueOf(data));

    Instant end = Instant.now();
    return Duration.between(start, end);
  }
}
