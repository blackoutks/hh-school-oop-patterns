package ru.hh.school.ooppatterns.creational.builder.solution;

public class Main {

  public static void main(String[] args) {
    Vacancy fullVacancy = new VacancyBuilder()
        .setVacancyId(1)
        .setPreviousVacancyId(2)
        .setEmployerId(3)
        .setStatus("status")
        .setName("name")
        .setDescription("description")
        .setRegionId(4)
        .setMinSalary(5L)
        .setMaxSalary(6L)
        .setArchived(true)
        .setApproved(false)
        .setVisible(true)
        .build();

    System.out.println("fullVacancy=" + fullVacancy);

    Vacancy shortVacancy = new VacancyBuilder()
        .setVacancyId(2)
        .setArchived(true)
        .build();

    System.out.println("shortVacancy=" + shortVacancy);

    HhVacancy hhVacancy = new HhVacancy()
        .setVacancyId(1)
        .setPreviousVacancyId(2)
        .setEmployerId(3)
        .setStatus("status")
        .setName("name")
        .setDescription("description")
        .setRegionId(4)
        .setMinSalary(5L)
        .setMaxSalary(6L)
        .setArchived(true)
        .setApproved(false)
        .setVisible(true);

    System.out.println("hhVacancy=" + hhVacancy);
  }
}
