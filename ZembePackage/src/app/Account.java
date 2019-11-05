package app;


class Account extends ZembeUser implements CanRunErrand,CanCreateErrand{
  private String accountType ;
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
   */
  public Account(String firstName, String secondName, String email, String unique, String phoneNumber, String momo, String location,String accountType){
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
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Errand createErrand() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean deleteErrand() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Errand editErrand(Account creator, Errand errand) {
    // TODO Auto-generated method stub
    return null;
  }

  
}