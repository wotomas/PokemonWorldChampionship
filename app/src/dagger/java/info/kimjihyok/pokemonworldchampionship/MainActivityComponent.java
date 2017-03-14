package info.kimjihyok.pokemonworldchampionship;

import javax.inject.Singleton;

import dagger.Component;
import info.kimjihyok.pokemonworldchampionship.dagger.GymLeaderModule;
import info.kimjihyok.pokemonworldchampionship.dagger.MainActivity;
import info.kimjihyok.pokemonworldchampionship.dagger.PokemonVersionModule;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.*;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.*;

/**
 * Created by jimmy on 14/03/2017.
 */
@Singleton
@Component(modules = {PokemonVersionModule.class, GymLeaderModule.class})
public interface MainActivityComponent {
  void inject(MainActivity app);
//  PokemonVersion1 inject(PokemonVersion1 version);
//  PokemonVersion2 inject(PokemonVersion2 version);
//  PokemonVersion3 inject(PokemonVersion3 version);
//  PokemonVersion4 inject(PokemonVersion4 version);
//  PokemonVersion5 inject(PokemonVersion5 version);
//  PokemonVersion6 inject(PokemonVersion6 version);
//  PokemonVersion7 inject(PokemonVersion7 version);
//  PokemonVersion8 inject(PokemonVersion8 version);
//  PokemonVersion9 inject(PokemonVersion9 version);
//  PokemonVersion10 inject(PokemonVersion10 version);
//  PokemonVersion11 inject(PokemonVersion11 version);
//  PokemonVersion12 inject(PokemonVersion12 version);
//  PokemonVersion13 inject(PokemonVersion13 version);
//  PokemonVersion14 inject(PokemonVersion14 version);
//  PokemonVersion15 inject(PokemonVersion15 version);
//
//  GymLeader1 inject(GymLeader1 gymLeader);
//  GymLeader2 inject(GymLeader2 gymLeader);
//  GymLeader3 inject(GymLeader3 gymLeader);
//  GymLeader4 inject(GymLeader4 gymLeader);
//  GymLeader5 inject(GymLeader5 gymLeader);
//  GymLeader6 inject(GymLeader6 gymLeader);
//  GymLeader7 inject(GymLeader7 gymLeader);
//  GymLeader8 inject(GymLeader8 gymLeader);
//  GymLeader9 inject(GymLeader9 gymLeader);
//  GymLeader10 inject(GymLeader10 gymLeader);
//
//  GymLeader11 inject(GymLeader11 gymLeader);
//  GymLeader12 inject(GymLeader12 gymLeader);
//  GymLeader13 inject(GymLeader13 gymLeader);
//  GymLeader14 inject(GymLeader14 gymLeader);
//  GymLeader15 inject(GymLeader15 gymLeader);
//  GymLeader16 inject(GymLeader16 gymLeader);
//  GymLeader17 inject(GymLeader17 gymLeader);
//  GymLeader18 inject(GymLeader18 gymLeader);
//  GymLeader19 inject(GymLeader19 gymLeader);
//  GymLeader20 inject(GymLeader20 gymLeader);
//
//  GymLeader21 inject(GymLeader21 gymLeader);
//  GymLeader22 inject(GymLeader22 gymLeader);
//  GymLeader23 inject(GymLeader23 gymLeader);
//  GymLeader24 inject(GymLeader24 gymLeader);
//  GymLeader25 inject(GymLeader25 gymLeader);
//  GymLeader26 inject(GymLeader26 gymLeader);
//  GymLeader27 inject(GymLeader27 gymLeader);
//  GymLeader28 inject(GymLeader28 gymLeader);
//  GymLeader29 inject(GymLeader29 gymLeader);
//  GymLeader30 inject(GymLeader30 gymLeader);
//
//  GymLeader31 inject(GymLeader31 gymLeader);
//  GymLeader32 inject(GymLeader32 gymLeader);
//  GymLeader33 inject(GymLeader33 gymLeader);
//  GymLeader34 inject(GymLeader34 gymLeader);
//  GymLeader35 inject(GymLeader35 gymLeader);
//  GymLeader36 inject(GymLeader36 gymLeader);
//  GymLeader37 inject(GymLeader37 gymLeader);
//  GymLeader38 inject(GymLeader38 gymLeader);
//  GymLeader39 inject(GymLeader39 gymLeader);
//  GymLeader40 inject(GymLeader40 gymLeader);
}
