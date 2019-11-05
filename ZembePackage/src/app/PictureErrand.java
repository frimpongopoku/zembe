package app;


import java.util.ArrayList;

class PictureErrand extends Errand {
  private ArrayList<String> imageArray;

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
   * @param imageArray
   */
  public PictureErrand(String unique, String title, String description, String createdAt, String creatorID,
      String expiryDate,int bounty, ErrandInstructions rules, ArrayList<String> imageArray) {
    super(unique, title, description, createdAt, creatorID, expiryDate,bounty,rules);
    this.imageArray = imageArray;
  }

  public ArrayList<String> getImageArray() {
    return imageArray;
  }

  public void setImageArray(ArrayList<String> imageArray) {
    this.imageArray = imageArray;
  }

  public void addAnImage(String imageURL) {
    if (imageArray.size() != 3 && !imageURL.isEmpty()) {
      imageArray.add(imageURL);
    }
  }

  public void removeAnImage(String imageURL) {
    int index = imageArray.indexOf(imageURL);
    if (index >= 0) {
      imageArray.remove(index);
    }

  }

  public void removeAnImage(int index) {
    if (index >= 0) {
      imageArray.remove(index);
    }
  }

}