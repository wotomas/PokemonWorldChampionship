package com.example;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Inject;
import javax.lang.model.element.Modifier;

public class Generator {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    System.out.println("PokemonWorldChampionship DI framework comparison code generation begins!");

    createPokemon();
    createTrainers();




  }

  private static void createTrainers() throws IOException, ClassNotFoundException {
    for(int i = 1; i < 801; i++) {
      TypeSpec.Builder trainerBuilder = TypeSpec.classBuilder("Trainer" + i)
        .addModifiers(Modifier.PUBLIC);
      for(int j = 1; j < 7; j++) {
        FieldSpec pokemons = FieldSpec.builder(Class.forName("info.kimjihyok.pokemonworldchampionship.generated.pokemon.Pokemon" + j), "pokemon" + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        trainerBuilder.addField(pokemons);
      }

      TypeSpec trainer = trainerBuilder.build();

      JavaFile javaFile = JavaFile.builder("info.kimjihyok.pokemonworldchampionship.generated.trainer", trainer)
        .build();

      // File
      File newFile = new File("app/src/main/java/");
      System.out.println("Path: " + newFile.getAbsolutePath() + " " + newFile.getName() + " ");
      javaFile.writeTo(newFile);


    }
  }

  private static void createPokemon() throws IOException {
    for(int i = 1; i < 7; i++) {
      TypeSpec pokemon = TypeSpec.classBuilder("Pokemon" + i)
        .addModifiers(Modifier.PUBLIC)
        .build();

      JavaFile javaFile = JavaFile.builder("info.kimjihyok.pokemonworldchampionship.generated.pokemon", pokemon)
        .build();

      javaFile.writeTo(new File("app/src/main/java/"));
    }
  }
}
