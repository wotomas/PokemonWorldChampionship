package com.example;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.lang.model.element.Modifier;

public class Generator {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    System.out.println("PokemonWorldChampionship DI framework comparison code generation begins!");

    createPokemon();
    createTrainers();
    createPokemonVersions();
    createGymLeaders();
  }

  private static void createGymLeaders() throws ClassNotFoundException, IOException {
    for(int i = 1; i < 40; i++) {
      TypeSpec.Builder gymLeaders = TypeSpec.classBuilder("GymLeaders" + i)
        .addModifiers(Modifier.PUBLIC);

      for(int j = 1; j < 20; j++) {
        FieldSpec trainers = FieldSpec.builder(Class.forName("info.kimjihyok.pokemonworldchampionship.generated.trainer.Trainer" + j), "trainer" + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        gymLeaders.addField(trainers);
      }

      TypeSpec gymLeader = gymLeaders
        .build();

      JavaFile javaFile = JavaFile.builder("info.kimjihyok.pokemonworldchampionship.generated.gymleaders", gymLeader)
        .build();

      javaFile.writeTo(new File("app/src/main/java/"));
      javaFile.writeTo(new File("classgenerator/src/main/java/"));
    }
  }

  private static void createPokemonVersions() throws ClassNotFoundException, IOException {
    for(int i = 1; i < 16; i++) {
      TypeSpec.Builder pokemonVersion = TypeSpec.classBuilder("PokemonVersion" + i)
        .addModifiers(Modifier.PUBLIC);

      for(int j = 1; j < 801; j++) {
        FieldSpec trainers = FieldSpec.builder(Class.forName("info.kimjihyok.pokemonworldchampionship.generated.trainer.Trainer" + j), "trainer" + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        pokemonVersion.addField(trainers);
      }

      TypeSpec version = pokemonVersion
        .build();

      JavaFile javaFile = JavaFile.builder("info.kimjihyok.pokemonworldchampionship.generated.pokemonversion", version)
        .build();

      javaFile.writeTo(new File("app/src/main/java/"));
      javaFile.writeTo(new File("classgenerator/src/main/java/"));
    }
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

      javaFile.writeTo(new File("app/src/main/java/"));
      javaFile.writeTo(new File("classgenerator/src/main/java/"));
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
      javaFile.writeTo(new File("classgenerator/src/main/java/"));
    }
  }
}
