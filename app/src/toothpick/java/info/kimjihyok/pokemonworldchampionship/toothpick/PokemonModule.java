package info.kimjihyok.pokemonworldchampionship.toothpick;

import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.*;
import toothpick.config.Module;

/**
 * Created by jimmy on 14/03/2017.
 */
public class PokemonModule extends Module {
  public PokemonModule() {
    bind(Pokemon1.class).toInstance(new Pokemon1("PIKACHU"));
    bind(Pokemon2.class).toInstance(new Pokemon2("CHARIZARD"));
    bind(Pokemon3.class).toInstance(new Pokemon3("BLASTOISE"));
    bind(Pokemon4.class).toInstance(new Pokemon4("VENUSAUR"));
    bind(Pokemon5.class).toInstance(new Pokemon5("MEWTWO"));
    bind(Pokemon6.class).toInstance(new Pokemon6("JIGGLYPUFF"));
  }
}
