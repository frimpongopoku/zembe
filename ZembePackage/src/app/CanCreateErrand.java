package app;
interface CanCreateErrand{
  
  abstract Errand createErrand(); 
  abstract Boolean deleteErrand(); 
  /**
   * 
   * @param creator
   * @param errand
   */
  abstract Errand editErrand(Account creator, Errand errand);

}