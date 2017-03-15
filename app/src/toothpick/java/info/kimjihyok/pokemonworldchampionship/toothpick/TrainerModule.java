package info.kimjihyok.pokemonworldchampionship.toothpick;

import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemonversion.PokemonVersion1;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.trainer.*;
import toothpick.config.Module;

/**
 * Created by jimmy on 14/03/2017.
 */
public class TrainerModule extends Module {
  public TrainerModule() {
    bind(Trainer1.class).toInstance(new Trainer1());
  }
}
