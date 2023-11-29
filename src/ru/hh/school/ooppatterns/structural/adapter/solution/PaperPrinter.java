package ru.hh.school.ooppatterns.structural.adapter.solution;

public class PaperPrinter implements Printer {

  @Override
  public void init() {
    System.out.println("Initializing Paper Printer");
  }

  @Override
  public void print(String content) {
    System.out.println("Printing on paper: " + content);
  }
}
