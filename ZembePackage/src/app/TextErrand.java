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
  public TextErrand(String unique, String title, String description,  String creatorID, String expiryDate,int bounty, ErrandInstructions rules, String longDescription,Account runner){
    super(unique, title, description, creatorID, expiryDate, bounty, rules,runner); 
    this.longDescription = longDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  
}