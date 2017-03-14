package com.example;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.lang.model.element.Modifier;

public class Generator {
  private static final String GYM_LEADER = "GymLeader";
  private static final String TRAINER = "Trainer";
  private static final String POKEMON = "Pokemon";
  private static final String POKEMON_VERSION = "PokemonVersion";

  private static final String DAGGER_PACKAGE_PATH = "info.kimjihyok.pokemonworldchampionship.dagger.generated";
  private static final String DAGGER_APP_PATH = "../app/src/dagger/java/";
  private static final String DAGGER_GENERATOR_PATH = "../classgenerator/src/main/java/";

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    System.out.println("PokemonWorldChampionship DI framework comparison code generation begins!");

    createPokemon();
    try {
      createTrainers();
    } catch (ClassNotFoundException e) {
      System.out.println("Pokemon Generated Complete! Run './gradlew injectAll' again!");
      return;
    }

    try {
      createPokemonVersions();
    } catch (ClassNotFoundException e) {
      System.out.println("Pokemon Trainer Generated Complete! Run './gradlew injectAll' again!");
      return;
    }

    createGymLeaders();
    System.out.println("All Classes Generated Complete!");
  }

  private static void createGymLeaders() throws ClassNotFoundException, IOException {
    for(int i = 1; i < 41; i++) {
      TypeSpec.Builder gymLeaders = TypeSpec.classBuilder(GYM_LEADER + i)
        .addModifiers(Modifier.PUBLIC);

      for(int j = 1; j < 21; j++) {
        FieldSpec trainers = FieldSpec.builder(Class.forName(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        gymLeaders.addField(trainers);
      }

      TypeSpec gymLeader = gymLeaders
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + GYM_LEADER.toLowerCase(), gymLeader)
        .build();

      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }

  private static void createPokemonVersions() throws ClassNotFoundException, IOException {
    for(int i = 1; i < 16; i++) {
      TypeSpec.Builder pokemonVersion = TypeSpec.classBuilder(POKEMON_VERSION + i)
        .addModifiers(Modifier.PUBLIC);

      for(int j = 1; j < 801; j++) {
        FieldSpec trainers = FieldSpec.builder(Class.forName(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        pokemonVersion.addField(trainers);
      }

      TypeSpec version = pokemonVersion
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + POKEMON_VERSION.toLowerCase(), version)
        .build();

      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }

  private static void createTrainers() throws IOException, ClassNotFoundException {
    for(int i = 1; i < 801; i++) {
      TypeSpec.Builder trainerBuilder = TypeSpec.classBuilder(TRAINER + i)
        .addModifiers(Modifier.PUBLIC);
      for(int j = 1; j < 7; j++) {
        FieldSpec pokemons = FieldSpec.builder(Class.forName(DAGGER_PACKAGE_PATH + "." + POKEMON.toLowerCase() + "." + POKEMON + j), POKEMON.toLowerCase() + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        trainerBuilder.addField(pokemons);
      }

      TypeSpec trainer = trainerBuilder.build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase(), trainer)
        .build();

      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }

  private static void createPokemon() throws IOException {
    for(int i = 1; i < 7; i++) {
      TypeSpec pokemon = TypeSpec.classBuilder(POKEMON + i)
        .addModifiers(Modifier.PUBLIC)
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + POKEMON.toLowerCase(), pokemon)
        .build();

      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }
}
