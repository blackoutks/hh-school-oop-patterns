package ru.hh.school.ooppatterns.creational.singleton.problem;

public class DatabaseConnectionPool {

  public DatabaseConnectionPool() {
    System.out.println("Creating database connection pool instance");
  }

  public void getConnection() {
    System.out.println("Getting database connection");
  }
}
