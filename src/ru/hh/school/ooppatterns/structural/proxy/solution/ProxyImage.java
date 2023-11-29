package ru.hh.school.ooppatterns.structural.proxy.solution;

public class ProxyImage implements Image {

  private final String filePath;

  private RealImage realImage;

  public ProxyImage(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public void display() {
    if (realImage == null) {
      if (isImageFunny()) {
        realImage = new RealImage(filePath);
      } else {
        displayEmptyRectangle();
        return;
      }
    }
    realImage.display();
  }

  private boolean isImageFunny() {
    System.out.println("Checking the funnyness of " + filePath);
    if ("http://example.com/funny_image.jpg".equals(filePath)) {
      System.out.println("Image is funny");
      return true;
    }
    System.out.println("Image is not funny");
    return false;
  }

  private void displayEmptyRectangle() {
    System.out.println("Displaying empty rectangle");
  }
}
