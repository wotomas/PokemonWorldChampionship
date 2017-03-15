package info.kimjihyok.pokemonworldchampionship.toothpick;

import javax.inject.Inject;

import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemonversion.PokemonVersion1;
import toothpick.config.Module;

/**
 * Created by jimmy on 14/03/2017.
 */

public class PokemonVersionModule extends Module {
  public PokemonVersionModule() {
    bind(PokemonVersion1.class).toInstance(new PokemonVersion1());
  }
}
