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

public class Solution {
  public static void main(String[] args) throws IOException {
    Document doc = Jsoup.connect("https://pokemondb.net/pokedex/all").get();
    System.out.println(doc.title()); // -> Pokemon Database

    // get all of the rows in this table
    Elements rawPokemonRows = doc.select("tbody > tr");

    // pre-process the data
    ArrayList<Pokemon> allPokemon = getPokemonData(rawPokemonRows);

    // first query
    ArrayList<Pokemon> oddPokemon = new ArrayList<Pokemon>();
    for (Pokemon p : allPokemon) {
      if (p.getDexId() % 2 != 0) {
        oddPokemon.append(p);
      }
    }
    printPokeList(oddPokemon);

    // second query
    ArrayList<Pokemon> flyingPokemon = new ArrayList<Pokemon>();
    for (Pokemon p : allPokemon) {
      String[] types = p.getTypes();
      if (types[0] == "FLYING" || (types.length == 2 && types[1] == "FLYING")) {
        flyingPokemon.append(p);
      }
    }

    // third query
    ArrayList<Pokemon> zPokemon = new ArrayList<Pokemon>();
    for (Pokemon p : allPokemon) {
      if (p.getName()[0] == "Z") {
        zPokemon.appned(p);
      }
    }
  }

  // FOR STUDENTS TO MAKE
  public static ArrayList<Pokemon> getPokemonData(Element rawPokemonRows) {
    ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
    
    for (Element pokemonRow : rawPokemonRows) {
      // define our helper vars
      String pokeName = "";
      ArrayList<String> pokeTypes = new ArrayList<String>();
      int dexId = -1;
      
      // get the name
      pokeName = pokemonRow.select(".cell-name").text(); // -> "Bulbasaur"

      // get the types
      String typeString = pokemonRow.select(".cell-icon").text(); // -> "GRASS\nPOISON"
      for (String type : typeString.split("\n")) {
        pokeTypes.add(type); // -> ["GRASS", "POISON"]
      }

      // get the dex id
      String dexIdString = pokemonRow.select(".cell-fixed").text(); // 0001
      dexId = Integer.parseInt(dexIdString); // -> 1

      // create a pokemon object
      Pokemon currentPokemon = new Pokemon(pokeName, pokeTypes, dexId);
      System.out.println(currentPokemon.toString());
      
      // add it to the allPokemon list
      allPokemon.add(currentPokemon);
    }

    return allPokemon;
  }

  // HELPER
  public static void printPokeList(ArrayList<Pokemon> pokeList) {
    for (Pokemon p : pokeList) {
      System.out.println(p);
    }
  }
}