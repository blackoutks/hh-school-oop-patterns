package ru.hh.school.ooppatterns.structural.proxy.problem;

public class Main {

  public static void main(String[] args) {
    /*
     * TODO:
     *  Show only funny images. Display an empty rectangle if the image is not funny.
     *  Also, load images only when they need to be displayed.
     */
    Image funnyImage = new RealImage("http://example.com/funny_image.jpg");
    Image notFunnyImage = new RealImage("http://example.com/not_funny_image.jpg");

    System.out.println("Do some other stuff here...");

    funnyImage.display();
    notFunnyImage.display();
  }
}
