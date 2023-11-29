package ru.hh.school.ooppatterns.creational.builder.problem;

public class Main {

  public static void main(String[] args) {
    // TODO: Make vacancy creation clearer.
    Vacancy fullVacancy = new Vacancy(
        1,
        2,
        3,
        "status",
        "name",
        "description",
        4,
        5L,
        6L,
        null,
        null,
        true,
        false,
        true
    );

    System.out.println("fullVacancy=" + fullVacancy);

    Vacancy shortVacancy = new Vacancy(
        2,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        true,
        null,
        null
    );

    System.out.println("shortVacancy=" + shortVacancy);
  }
}
