package info.kimjihyok.pokemonworldchampionship.toothpick.generated.trainer;

import info.kimjihyok.pokemonworldchampionship.toothpick.PokemonModule;
import info.kimjihyok.pokemonworldchampionship.toothpick.TrainerModule;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.Pokemon1;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.Pokemon2;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.Pokemon3;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.Pokemon4;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.Pokemon5;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemon.Pokemon6;
import toothpick.Scope;
import toothpick.Toothpick;

import javax.inject.Inject;

public class Trainer1 {
  @Inject
  public Pokemon1 pokemon1;

  @Inject
  public Pokemon2 pokemon2;

  @Inject
  public Pokemon3 pokemon3;

  @Inject
  public Pokemon4 pokemon4;

  @Inject
  public Pokemon5 pokemon5;

  @Inject
  public Pokemon6 pokemon6;

  public Trainer1() {
    Scope scope = Toothpick.openScope("ToothPickDemo");
    scope.installModules(
      new PokemonModule()
    );
    Toothpick.inject(this, scope);
  }
}
