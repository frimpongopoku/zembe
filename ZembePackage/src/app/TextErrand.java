class TextErrand extends Errand {
  private String longDescription;
  public TextErrand(String unique, String title, String description, String createdAt, String creatorID, String expiryDate, ErrandInstructions rules,String longDescription){
    super(unique, title, description, createdAt, creatorID, expiryDate, rules); 
    this.longDescription = longDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  
}