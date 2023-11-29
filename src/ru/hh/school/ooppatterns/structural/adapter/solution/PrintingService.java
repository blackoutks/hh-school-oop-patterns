package ru.hh.school.ooppatterns.structural.adapter.solution;

public class PrintingService {

  private final Printer printer;

  public PrintingService(Printer printer) {
    this.printer = printer;
    printer.init();
  }

  public void printContent(String content) {
    printer.print(content);
  }
}
