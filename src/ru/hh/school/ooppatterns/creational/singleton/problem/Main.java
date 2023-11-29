package ru.hh.school.ooppatterns.creational.singleton.problem;

public class Main {

  public static void main(String[] args) {
    // TODO: The connection pool should always have a single instance.
    for (int i = 0; i < 3; i++) {
      DatabaseConnectionPool pool = new DatabaseConnectionPool();
      pool.getConnection();
    }
  }
}
