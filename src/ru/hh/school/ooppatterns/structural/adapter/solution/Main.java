package ru.hh.school.ooppatterns.structural.adapter.solution;

public class Main {

  public static void main(String[] args) {
    String content = "Amazing content!";

    PrintingService pdfPrintingService = new PrintingService(new PdfPrinter());
    pdfPrintingService.printContent(content);

    PrintingService paperPrintingService = new PrintingService(new PaperPrinter());
    paperPrintingService.printContent(content);

    PrintingService laserPrintingService = new PrintingService(new LaserPrinter());
    laserPrintingService.printContent(content);
  }
}
