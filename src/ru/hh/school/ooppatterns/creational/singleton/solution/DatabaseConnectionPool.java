package ru.hh.school.ooppatterns.creational.singleton.solution;

public class DatabaseConnectionPool {

  private static DatabaseConnectionPool instance;

  private DatabaseConnectionPool() {
    System.out.println("Creating database connection pool instance");
  }

  public static DatabaseConnectionPool getInstance() {
    if (instance == null) {
      instance = new DatabaseConnectionPool();
    }
    return instance;
  }

  public void getConnection() {
    System.out.println("Getting database connection");
  }
}
