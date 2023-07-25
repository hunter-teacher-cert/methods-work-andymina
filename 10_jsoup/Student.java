public class Student {
/**
DOCS USEd

calling select on an element
https://jsoup.org/cookbook/extracting-data/selector-syntax

getting text from an element
https://jsoup.org/cookbook/extracting-data/attributes-text-html
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class Student {
  public static void main(String[] args) throws IOException {
    // download the html of the current page
    Document doc = Jsoup.connect("https://pokemondb.net/pokedex/all").get();
    System.out.println(doc.title()); // -> Pokemon Database

    // get all of the rows in this table
    Elements rawPokemonRows = doc.select("tbody > tr");

    // pre-process the data
    ArrayList<Pokemon> allPokemon = getPokemonData(rawPokemonRows);

    /**
      FIRST QUERY

      Find all Pokemon with an odd `dexId` and store them in a list
      called `oddPokemon`. Print this list.
    */

    /**
      SECOND QUERY

      Find all Pokemon with the "FLYING" type and store them in a list 
      called `flyingPokemon`. Print this list.
    */

    /**
      THIRD QUERY
    
      Find all Pokemon that start with the letter Z and store
      them in a list called `zPokemon`. Print this list.
    */
  }

  // HELPER
  public static void printPokeList(ArrayList<Pokemon> pokeList) {
    for (Pokemon p : pokeList) {
      System.out.println(p);
    }
  }
}
