package info.kimjihyok.pokemonworldchampionship;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
