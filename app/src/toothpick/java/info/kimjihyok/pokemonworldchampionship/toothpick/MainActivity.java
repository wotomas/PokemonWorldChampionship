package info.kimjihyok.pokemonworldchampionship.toothpick;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import info.kimjihyok.pokemonworldchampionship.R;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.gymleader.*;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemonversion.*;
import toothpick.Scope;
import toothpick.Toothpick;


public class MainActivity extends AppCompatActivity {
  @Inject GymLeader1 mGymLeader1;
  @Inject GymLeader2 mGymLeader2;
  @Inject GymLeader3 mGymLeader3;
  @Inject GymLeader4 mGymLeader4;
  @Inject GymLeader5 mGymLeader5;
  @Inject GymLeader6 mGymLeader6;
  @Inject GymLeader7 mGymLeader7;
  @Inject GymLeader8 mGymLeader8;
  @Inject GymLeader9 mGymLeader9;
  @Inject GymLeader10 mGymLeader10;

  @Inject GymLeader11 mGymLeader11;
  @Inject GymLeader12 mGymLeader12;
  @Inject GymLeader13 mGymLeader13;
  @Inject GymLeader14 mGymLeader14;
  @Inject GymLeader15 mGymLeader15;
  @Inject GymLeader16 mGymLeader16;
  @Inject GymLeader17 mGymLeader17;
  @Inject GymLeader18 mGymLeader18;
  @Inject GymLeader19 mGymLeader19;
  @Inject GymLeader20 mGymLeader20;

  @Inject GymLeader21 mGymLeader21;
  @Inject GymLeader22 mGymLeader22;
  @Inject GymLeader23 mGymLeader23;
  @Inject GymLeader24 mGymLeader24;
  @Inject GymLeader25 mGymLeader25;
  @Inject GymLeader26 mGymLeader26;
  @Inject GymLeader27 mGymLeader27;
  @Inject GymLeader28 mGymLeader28;
  @Inject GymLeader29 mGymLeader29;
  @Inject GymLeader30 mGymLeader30;

  @Inject GymLeader31 mGymLeader31;
  @Inject GymLeader32 mGymLeader32;
  @Inject GymLeader33 mGymLeader33;
  @Inject GymLeader34 mGymLeader34;
  @Inject GymLeader35 mGymLeader35;
  @Inject GymLeader36 mGymLeader36;
  @Inject GymLeader37 mGymLeader37;
  @Inject GymLeader38 mGymLeader38;
  @Inject GymLeader39 mGymLeader39;
  @Inject GymLeader40 mGymLeader40;

  @Inject PokemonVersion1 mPokemonVersion;
  @Inject PokemonVersion2 mPokemonVersion2;
  @Inject PokemonVersion3 mPokemonVersion3;
  @Inject PokemonVersion4 mPokemonVersion4;
  @Inject PokemonVersion5 mPokemonVersion5;
  @Inject PokemonVersion6 mPokemonVersion6;
  @Inject PokemonVersion7 mPokemonVersion7;
  @Inject PokemonVersion8 mPokemonVersion8;
  @Inject PokemonVersion9 mPokemonVersion9;
  @Inject PokemonVersion10 mPokemonVersion10;
  @Inject PokemonVersion11 mPokemonVersion11;
  @Inject PokemonVersion12 mPokemonVersion12;
  @Inject PokemonVersion13 mPokemonVersion13;
  @Inject PokemonVersion14 mPokemonVersion14;
  @Inject PokemonVersion15 mPokemonVersion15;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Scope scope = Toothpick.openScope("ToothPickDemo");
    scope.installModules(
        new PokemonVersionModule()
      , new GymLeaderModule()
    );
    Toothpick.inject(this, scope);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      reportFullyDrawn();
    } else {
      throw new IllegalStateException("Please Use Android Device Version higher than 19 for profiling app cold start time speed");
    }
  }
}
