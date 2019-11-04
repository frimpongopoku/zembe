interface CanRunErrand{

  //this collects the entire object of the user that is interested in running a particular errand
  public abstract Account acceptErrand(Account user);
  public abstract void  forfeitErrand();

}