package info.kimjihyok.pokemonworldchampionship.dagger.generated.trainer;

import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon1;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon2;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon3;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon4;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon5;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemon.Pokemon6;
import javax.inject.Inject;

public class Trainer27 {
  public Pokemon1 pokemon1;

  public Pokemon2 pokemon2;

  public Pokemon3 pokemon3;

  public Pokemon4 pokemon4;

  public Pokemon5 pokemon5;

  public Pokemon6 pokemon6;

  @Inject
  public Trainer27(Pokemon1 pokemon1, Pokemon2 pokemon2, Pokemon3 pokemon3, Pokemon4 pokemon4,
      Pokemon5 pokemon5, Pokemon6 pokemon6) {
    this.pokemon1 = pokemon1;
    this.pokemon2 = pokemon2;
    this.pokemon3 = pokemon3;
    this.pokemon4 = pokemon4;
    this.pokemon5 = pokemon5;
    this.pokemon6 = pokemon6;
  }
}
