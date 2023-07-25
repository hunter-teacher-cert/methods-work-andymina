import java.util.*;

public class Pokemon {
  private String name;
  private ArrayList<String> types;
  private int dexId;
  
  public Pokemon(String name, ArrayList<String> types, int dexId) {
    this.name = name; 
    this.types = types;
    this.dexId = dexId;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<String> getTypes() {
    return this.types;
  }

  public int getDexId() {
    return this.dexId;
  }

  public String toString() {
    String pokemon_string = "";
    pokemon_string += "Name: " + this.name + "\n";
    pokemon_string += "Type: ";
    for (int i = 0; i < this.types.size(); i++) {
      pokemon_string += this.types.get(i);
      if (i != this.types.size() - 1) {
        pokemon_string += "/";
      }
      else {
        pokemon_string += "\n";
      }
    }
    pokemon_string += "Dex Id: " + this.dexId + "\n";
    return pokemon_string;
  }
}