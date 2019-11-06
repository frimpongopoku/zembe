package app;

import java.util.Date;

abstract class Errand{
  private String unique, title, description,creatorID, expiryDate;
  private String status = Konstants.ERRAND_LIVE; 
  private int bounty = 0;
  private String createdAt = String.valueOf(new Date());
  private ErrandInstructions rules; 
  private Account runner;
  /**
   * 
   * @param unique
   * @param title
   * @param description
   * @param createdAt
   * @param creatorID
   * @param expiryDate
   * @param bounty
   * @param rules
   * @param runner
   */
  public Errand(String unique, String title, String description, String creatorID, String expiryDate, int bounty, ErrandInstructions rules, Account runner){
    this.unique = unique; 
    this.title = title; 
    this.description = description; 
    this.creatorID  = creatorID; 
    this.expiryDate = expiryDate; 
    this.rules = rules;
    this.bounty = bounty; 
    this.runner = runner;
  }

  public String getUnique() {
    return unique;
  }

  public void setUnique(String unique) {
    this.unique = unique;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getCreatorID() {
    return creatorID;
  }

  public void setCreatorID(String creatorID) {
    this.creatorID = creatorID;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public ErrandInstructions getRules() {
    return rules;
  }

  public void setRules(ErrandInstructions rules) {
    this.rules = rules;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getBounty() {
    return bounty;
  }

  public void setBounty(int bounty) {
    this.bounty = bounty;
  }

  public Account getRunner() {
    return runner;
  }

  public void setRunner(Account runner) {
    this.runner = runner;
  }






}