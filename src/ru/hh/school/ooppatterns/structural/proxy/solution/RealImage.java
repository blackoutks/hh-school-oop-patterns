package ru.hh.school.ooppatterns.structural.proxy.solution;

public class RealImage implements Image {

  private final String filePath;

  public RealImage(String filePath) {
    this.filePath = filePath;
    load();
  }

  @Override
  public void display() {
    System.out.println("Displaying " + filePath);
  }

  private void load() {
    System.out.println("Loading " + filePath);
  }
}
