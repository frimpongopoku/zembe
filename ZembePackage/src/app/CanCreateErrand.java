package app;
interface CanCreateErrand{
  
  abstract Errand createErrand(String unique, String title, String description,int bounty,String longDescription,ErrandInstructions instructions,Account runner); 
  abstract Boolean deleteErrand(Errand errand); 
  abstract Boolean deleteErrand(String errand); 
  abstract void editErrand();

}