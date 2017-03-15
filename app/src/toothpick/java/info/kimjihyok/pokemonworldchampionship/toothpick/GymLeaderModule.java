package info.kimjihyok.pokemonworldchampionship.toothpick;

import info.kimjihyok.pokemonworldchampionship.toothpick.generated.gymleader.GymLeader1;
import toothpick.config.Module;

/**
 * Created by jimmy on 14/03/2017.
 */
public class GymLeaderModule extends Module {
  public GymLeaderModule() {
    bind(GymLeader1.class).toInstance(new GymLeader1());
  }
}
