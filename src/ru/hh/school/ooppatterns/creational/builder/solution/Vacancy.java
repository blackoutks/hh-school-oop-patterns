package ru.hh.school.ooppatterns.creational.builder.solution;

import java.time.LocalDateTime;

public class Vacancy {

  private final Integer vacancyId;
  private final Integer previousVacancyId;
  private final Integer employerId;
  private final String status;
  private final String name;
  private final String description;
  private final Integer regionId;
  private final Long minSalary;
  private final Long maxSalary;
  private final LocalDateTime creationTime;
  private final LocalDateTime publicationTime;
  private final Boolean archived;
  private final Boolean approved;
  private final Boolean visible;

  public Vacancy(
      Integer vacancyId,
      Integer previousVacancyId,
      Integer employerId,
      String status,
      String name,
      String description,
      Integer regionId,
      Long minSalary,
      Long maxSalary,
      LocalDateTime creationTime,
      LocalDateTime publicationTime,
      Boolean archived,
      Boolean approved,
      Boolean visible
  ) {
    this.vacancyId = vacancyId;
    this.previousVacancyId = previousVacancyId;
    this.employerId = employerId;
    this.status = status;
    this.name = name;
    this.description = description;
    this.regionId = regionId;
    this.minSalary = minSalary;
    this.maxSalary = maxSalary;
    this.creationTime = creationTime;
    this.publicationTime = publicationTime;
    this.archived = archived;
    this.approved = approved;
    this.visible = visible;
  }

  @Override
  public String toString() {
    return "Vacancy{" +
        "vacancyId=" + vacancyId +
        ", previousVacancyId=" + previousVacancyId +
        ", employerId=" + employerId +
        ", status='" + status + '\'' +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", regionId=" + regionId +
        ", minSalary=" + minSalary +
        ", maxSalary=" + maxSalary +
        ", creationTime=" + creationTime +
        ", publicationTime=" + publicationTime +
        ", archived=" + archived +
        ", approved=" + approved +
        ", visible=" + visible +
        '}';
  }
}
