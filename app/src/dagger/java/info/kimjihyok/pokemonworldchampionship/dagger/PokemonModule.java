package info.kimjihyok.pokemonworldchampionship.dagger;

import dagger.Module;
import dagger.Provides;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon1;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon2;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon3;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon4;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon5;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon6;

/**
 * Created by jimmy on 14/03/2017.
 */
@Module
public class PokemonModule {
  @Provides
  public Pokemon1 providePokemon1() {
    return new Pokemon1("PIKACHU");
  }

  @Provides
  public Pokemon2 providePokemon2() {
    return new Pokemon2("CHARIZARD");
  }

  @Provides
  public Pokemon3 providePokemon3() {
    return new Pokemon3("BLASTOISE");
  }

  @Provides
  public Pokemon4 providePokemon4() {
    return new Pokemon4("VENUSAUR");
  }

  @Provides
  public Pokemon5 providePokemon5() {
    return new Pokemon5("MEWTWO");
  }

  @Provides
  public Pokemon6 providePokemon6() {
    return new Pokemon6("JIGGLYPUFF");
  }
}
