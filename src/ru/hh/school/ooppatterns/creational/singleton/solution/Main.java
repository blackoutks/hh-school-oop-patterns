package ru.hh.school.ooppatterns.creational.singleton.solution;

public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();
      pool.getConnection();
    }
  }
}
