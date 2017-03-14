package info.kimjihyok.pokemonworldchampionship;

import javax.inject.Singleton;

import dagger.Component;
import info.kimjihyok.pokemonworldchampionship.dagger.GymLeaderModule;
import info.kimjihyok.pokemonworldchampionship.dagger.MainActivity;
import info.kimjihyok.pokemonworldchampionship.dagger.PokemonVersionModule;

/**
 * Created by jimmy on 14/03/2017.
 */
@Singleton
@Component(modules = {PokemonVersionModule.class, GymLeaderModule.class})
public interface MainActivityComponent {
  void inject(MainActivity app);
}
