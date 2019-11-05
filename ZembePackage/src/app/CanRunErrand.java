package app;

interface CanRunErrand{

  /**
   * 
   * @param user
   * @param errand
   * @return
   */
  //this collects the entire object of the user that is interested in running a particular errand
  public abstract Errand acceptErrand(Account user, Errand errand);
  /**
   * 
   * @param errand The errand that a particular user is in charge of
   * @return
   */
  public abstract Errand  forfeitErrand(Errand errand);

}