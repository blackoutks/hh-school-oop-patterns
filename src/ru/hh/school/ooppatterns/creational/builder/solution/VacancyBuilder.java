package ru.hh.school.ooppatterns.creational.builder.solution;

import java.time.LocalDateTime;

public class VacancyBuilder {

  private Integer vacancyId;
  private Integer previousVacancyId;
  private Integer employerId;
  private String status;
  private String name;
  private String description;
  private Integer regionId;
  private Long minSalary;
  private Long maxSalary;
  private LocalDateTime creationTime;
  private LocalDateTime publicationTime;
  private Boolean archived;
  private Boolean approved;
  private Boolean visible;

  public Vacancy build() {
    return new Vacancy(
        vacancyId,
        previousVacancyId,
        employerId,
        status,
        name,
        description,
        regionId,
        minSalary,
        maxSalary,
        creationTime,
        publicationTime,
        archived,
        approved,
        visible
    );
  }

  public VacancyBuilder setVacancyId(Integer vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  public VacancyBuilder setPreviousVacancyId(Integer previousVacancyId) {
    this.previousVacancyId = previousVacancyId;
    return this;
  }

  public VacancyBuilder setEmployerId(Integer employerId) {
    this.employerId = employerId;
    return this;
  }

  public VacancyBuilder setStatus(String status) {
    this.status = status;
    return this;
  }

  public VacancyBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public VacancyBuilder setDescription(String description) {
    this.description = description;
    return this;
  }

  public VacancyBuilder setRegionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  public VacancyBuilder setMinSalary(Long minSalary) {
    this.minSalary = minSalary;
    return this;
  }

  public VacancyBuilder setMaxSalary(Long maxSalary) {
    this.maxSalary = maxSalary;
    return this;
  }

  public VacancyBuilder setCreationTime(LocalDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public VacancyBuilder setPublicationTime(LocalDateTime publicationTime) {
    this.publicationTime = publicationTime;
    return this;
  }

  public VacancyBuilder setArchived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  public VacancyBuilder setApproved(Boolean approved) {
    this.approved = approved;
    return this;
  }

  public VacancyBuilder setVisible(Boolean visible) {
    this.visible = visible;
    return this;
  }
}
