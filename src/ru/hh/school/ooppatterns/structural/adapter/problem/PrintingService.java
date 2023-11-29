package ru.hh.school.ooppatterns.structural.adapter.problem;

public class PrintingService {

  private Printer printer;
  private LaserBurner laserBurner;

  public PrintingService(Printer printer) {
    this.printer = printer;
    printer.init();
  }

  public PrintingService(LaserBurner laserBurner) {
    this.laserBurner = laserBurner;
    this.laserBurner.turnOn();
    this.laserBurner.preheat();
  }

  public void printContent(String content) {
    if (printer != null) {
      printer.print(content);
    } else if (laserBurner != null) {
      try {
        laserBurner.burn(content.toCharArray());
      } catch (Exception e) {
        // do nothing
      }
    }
  }
}
