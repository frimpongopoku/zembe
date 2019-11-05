package app;
import java.util.ArrayList;

class ErrandInstructions {
  private ArrayList<String> list;

  public void add(String string) {
    if (!string.isEmpty()) {
      list.add(string);
    }
  }

  public void remove(int index) {
    if (index >= 0) {
      list.remove(index);
    }
  }

  public void remove(String string) {
    int index = list.indexOf(string);
    if (index >= 0) {
      list.remove(index);
    }
  }

  public ArrayList<String> getInstructions() {
    return list;
  }

}