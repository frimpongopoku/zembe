package app;

class Account extends ZembeUser implements CanRunErrand, CanCreateErrand {
  private String accountType;

  /**
   * 
   * @param firstName
   * @param secondName
   * @param email
   * @param unique
   * @param phoneNumber
   * @param momo
   * @param location
   * @param accountType
   * 
   */
  public Account(String firstName, String secondName, String email, String unique, String phoneNumber, String momo,
      String location, String accountType) {
    super(firstName, secondName, email, unique, phoneNumber, momo, location);
    this.accountType = accountType;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  @Override
  public Errand acceptErrand(Account user, Errand errand) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Errand forfeitErrand(Errand errand) {
    // return errand with a null runner ID
    // and reset the errand mode
    errand.setRunner(null);
    errand.setStatus(Konstants.ERRAND_LIVE);
    return errand;
  }

  @Override
  public Errand createErrand(String unique, String title, String description, int bounty, String longDescription,
      ErrandInstructions instructions, Account runner) {
    Errand mErrand = new TextErrand(unique, title, description, this.getUnique(), "22nd may", bounty, instructions,
        longDescription, runner);
    return mErrand;
  }

  @Override
  public Boolean deleteErrand(Errand errand) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean deleteErrand(String unique) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void editErrand() {
  }

}