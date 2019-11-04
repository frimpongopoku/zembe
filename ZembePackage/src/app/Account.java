class Account extends ZembeUser{
  private String accountType ;
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

  
}