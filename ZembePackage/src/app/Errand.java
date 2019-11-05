package app;

 abstract class Errand{
  private String unique, title, description, createdAt, creatorID, expiryDate;
  private String status = Konstants.ERRAND_LIVE; 
  private int bounty = 0;
  private ErrandInstructions rules; 
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
   */
  public Errand(String unique, String title, String description, String createdAt, String creatorID, String expiryDate, int bounty, ErrandInstructions rules){
    this.unique = unique; 
    this.title = title; 
    this.description = description; 
    this.createdAt = createdAt; 
    this.creatorID  = creatorID; 
    this.expiryDate = expiryDate; 
    this.rules = rules;
    this.bounty = bounty;
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






}