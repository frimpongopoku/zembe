package app;


class TextErrand extends Errand {
  private String longDescription;
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
   * @param longDescription
   */
  public TextErrand(String unique, String title, String description, String createdAt, String creatorID, String expiryDate,int bounty, ErrandInstructions rules, String longDescription){
    super(unique, title, description, createdAt, creatorID, expiryDate, bounty, rules); 
    this.longDescription = longDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  
}