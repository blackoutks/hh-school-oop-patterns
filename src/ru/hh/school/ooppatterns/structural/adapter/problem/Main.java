package ru.hh.school.ooppatterns.structural.adapter.problem;

public class Main {

  public static void main(String[] args) {
    // TODO: Add support for laser burner.
    String content = "Amazing content!";

    PrintingService pdfPrintingService = new PrintingService(new PdfPrinter());
    pdfPrintingService.printContent(content);

    PrintingService paperPrintingService = new PrintingService(new PaperPrinter());
    paperPrintingService.printContent(content);

    PrintingService laserPrintingService = new PrintingService(new LaserBurner());
    laserPrintingService.printContent(content);
  }
}
