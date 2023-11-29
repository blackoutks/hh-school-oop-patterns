package ru.hh.school.ooppatterns.structural.adapter.solution;

public class PdfPrinter implements Printer {

  @Override
  public void init() {
    System.out.println("Initializing PDF Printer");
  }

  @Override
  public void print(String content) {
    System.out.println("Printing to PDF: " + content);
  }
}
