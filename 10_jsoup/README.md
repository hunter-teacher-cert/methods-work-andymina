# Completing the Poke-Dex

## Instructions

0. Go to this [repl](https://replit.com/@andymina/JSoup-Assignment) and fork it.
1. Run the starter code `Wikipedia.java` to see an example of how JSoup works. [(Click here if you're interested in the JSoup documentation)](https://jsoup.org/)
2. Go to <https://pokemondb.net/pokedex/all> and view the data that you'll be working with. Note that each entry in the PokeDex table has a few attributes; for now, we are only concerned with the name, dex id, and the types.
3. After reviewing JSoup and your starting data, your goal will be to work on taking the data and turning it into objects of the Pokemon Class that has the following structure

```java
class Pokemon {
  private String name;
  private ArrayList<String> types;
  private int dex_id;
}
```

(The Pokemon class is further detailed in Pokemon.java)

4. To create objects of the Pokemon class, you will need to get each Pokemon's Name, Dex ID, and Type(s) from the HTML data, which may require some data-cleaning or pre-processing.
   - **TASK**: Create a function called `cleanPokeData` that transforms `rawPokemonRows` into an `ArrayList` of `Pokemon` objects.
5. After transforming/pre-processing your data, you should have an `ArrayList<Pokemon>` that you can query for the following information.
   - **TASK**: Using your cleaned Pokemon data, perform the following queries and print the results. NB: A function `printPokeList` is already provided to you.
      - All Pokemon with an odd Dex ID
      - All Pokemon with the Flying-Type
      - All Pokemon that start with the letter Z
