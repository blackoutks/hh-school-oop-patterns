package ru.hh.school.ooppatterns.structural.proxy.solution;

public class Main {

  public static void main(String[] args) {
    Image funnyImage = new ProxyImage("http://example.com/funny_image.jpg");
    Image notFunnyImage = new ProxyImage("http://example.com/not_funny_image.jpg");

    System.out.println("Do some other stuff here...");

    funnyImage.display();
    notFunnyImage.display();
  }
}
