package info.kimjihyok.pokemonworldchampionship.toothpick;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import info.kimjihyok.pokemonworldchampionship.R;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.gymleader.GymLeader1;
import info.kimjihyok.pokemonworldchampionship.toothpick.generated.pokemonversion.PokemonVersion1;
import toothpick.Scope;
import toothpick.Toothpick;


public class MainActivity extends AppCompatActivity {
  @Inject GymLeader1 mGymLeader1;
  @Inject PokemonVersion1 mPokemonVersion;


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
