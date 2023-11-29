package ru.hh.school.ooppatterns.creational.builder.solution;

import java.time.LocalDateTime;

public class HhVacancy {

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

  public Integer getVacancyId() {
    return vacancyId;
  }

  public HhVacancy setVacancyId(Integer vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  public Integer getPreviousVacancyId() {
    return previousVacancyId;
  }

  public HhVacancy setPreviousVacancyId(Integer previousVacancyId) {
    this.previousVacancyId = previousVacancyId;
    return this;
  }

  public Integer getEmployerId() {
    return employerId;
  }

  public HhVacancy setEmployerId(Integer employerId) {
    this.employerId = employerId;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public HhVacancy setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getName() {
    return name;
  }

  public HhVacancy setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public HhVacancy setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getRegionId() {
    return regionId;
  }

  public HhVacancy setRegionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  public Long getMinSalary() {
    return minSalary;
  }

  public HhVacancy setMinSalary(Long minSalary) {
    this.minSalary = minSalary;
    return this;
  }

  public Long getMaxSalary() {
    return maxSalary;
  }

  public HhVacancy setMaxSalary(Long maxSalary) {
    this.maxSalary = maxSalary;
    return this;
  }

  public LocalDateTime getCreationTime() {
    return creationTime;
  }

  public HhVacancy setCreationTime(LocalDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public LocalDateTime getPublicationTime() {
    return publicationTime;
  }

  public HhVacancy setPublicationTime(LocalDateTime publicationTime) {
    this.publicationTime = publicationTime;
    return this;
  }

  public Boolean getArchived() {
    return archived;
  }

  public HhVacancy setArchived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  public Boolean getApproved() {
    return approved;
  }

  public HhVacancy setApproved(Boolean approved) {
    this.approved = approved;
    return this;
  }

  public Boolean getVisible() {
    return visible;
  }

  public HhVacancy setVisible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  @Override
  public String toString() {
    return "HhVacancy{" +
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
