package info.kimjihyok.pokemonworldchampionship.none;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import info.kimjihyok.pokemonworldchampionship.R;


public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      reportFullyDrawn();
    } else {
      throw new IllegalStateException("Please Use Android Device Version higher than 19 for profiling app cold start time speed");
    }
  }
}
