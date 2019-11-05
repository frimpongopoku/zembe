package app;

 abstract class ZembeUser {
  private String firstName, secondName, email,unique, phoneNumber,momoNumber, geoLocation; 
  /**
   * 
   * @param firstName
   * @param secondName
   * @param email
   * @param unique
   * @param phoneNumber
   * @param momo
   * @param location
   */
  public ZembeUser(String firstName, String secondName, String email, String unique, String phoneNumber, String momo, String location){
    this.firstName  = firstName; 
    this.secondName = secondName; 
    this.email = email; 
    this.unique = unique; 
    this.phoneNumber = phoneNumber; 
    this.momoNumber = momo; 
    this.geoLocation = location; 
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUnique() {
    return unique;
  }

  public void setUnique(String unique) {
    this.unique = unique;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getMomoNumber() {
    return momoNumber;
  }

  public void setMomoNumber(String momoNumber) {
    this.momoNumber = momoNumber;
  }

  public String getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(String geoLocation) {
    this.geoLocation = geoLocation;
  }
  
















}