interface CanCreateErrand{

  abstract Errand createErrand(); 
  abstract Boolean deleteErrand(); 
  abstract void editErrand(Account creator, Errand errand);

}