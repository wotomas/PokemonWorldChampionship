package info.kimjihyok.pokemonworldchampionship.dagger;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import info.kimjihyok.pokemonworldchampionship.DaggerMainActivityComponent;
import info.kimjihyok.pokemonworldchampionship.MainActivityComponent;
import info.kimjihyok.pokemonworldchampionship.R;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader1;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader10;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader11;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader12;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader13;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader14;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader15;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader16;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader17;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader18;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader19;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader2;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader20;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader21;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader22;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader23;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader24;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader25;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader26;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader27;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader28;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader29;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader3;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader30;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader31;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader32;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader33;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader34;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader35;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader36;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader37;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader38;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader39;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader4;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader40;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader5;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader6;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader7;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader8;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.gymleader.GymLeader9;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion1;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion10;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion11;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion12;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion13;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion14;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion15;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion2;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion3;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion4;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion5;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion6;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion7;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion8;
import info.kimjihyok.pokemonworldchampionship.dagger.generated.pokemonversion.PokemonVersion9;


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

    MainActivityComponent component = DaggerMainActivityComponent
      .builder()
      .build();
    component.inject(this);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      reportFullyDrawn();
    } else {
      throw new IllegalStateException("Please Use Android Device Version higher than 19 for profiling app cold start time speed");
    }
  }
}
