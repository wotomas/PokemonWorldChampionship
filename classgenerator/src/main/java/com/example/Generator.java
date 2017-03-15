package com.example;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.lang.model.element.Modifier;

public class Generator {
  private static final String GYM_LEADER = "GymLeader";
  private static final String TRAINER = "Trainer";
  private static final String POKEMON = "Pokemon";
  private static final String POKEMON_VERSION = "PokemonVersion";

  private static final String DAGGER_PACKAGE_PATH = "info.kimjihyok.pokemonworldchampionship.dagger.generated";
  private static final String DAGGER_APP_PATH = "../app/src/dagger/java/";
  private static final String TOOTHPICK_PACKAGE_PATH = "info.kimjihyok.pokemonworldchampionship.toothpick.generated";
  private static final String TOOTHPICK_APP_PATH = "../app/src/toothpick/java/";
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

      TypeSpec.Builder toothPickGymLeaders = TypeSpec.classBuilder(GYM_LEADER + i)
        .addModifiers(Modifier.PUBLIC);

      MethodSpec.Builder constructorBuilder = MethodSpec.constructorBuilder()
        .addAnnotation(Inject.class)
        .addModifiers(Modifier.PUBLIC);

      for(int j = 1; j < 21; j++) {
        FieldSpec trainers = FieldSpec.builder(Class.forName(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addModifiers(Modifier.PUBLIC)
          .build();

        FieldSpec toothPickTrainers = FieldSpec.builder(Class.forName(TOOTHPICK_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        constructorBuilder
          .addParameter(Class.forName(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addStatement("this.$N = $N", TRAINER.toLowerCase() + j, TRAINER.toLowerCase() + j);

        gymLeaders.addField(trainers);
        toothPickGymLeaders.addField(toothPickTrainers);
      }

      MethodSpec constructor = constructorBuilder.build();

      TypeSpec gymLeader = gymLeaders
        .addMethod(constructor)
        .build();

      TypeSpec toothPickGymLeader = toothPickGymLeaders
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + GYM_LEADER.toLowerCase(), gymLeader)
        .build();

      JavaFile toothPickJavaFile = JavaFile.builder(TOOTHPICK_PACKAGE_PATH + "." + GYM_LEADER.toLowerCase(), toothPickGymLeader).build();

      toothPickJavaFile.writeTo(new File(TOOTHPICK_APP_PATH));
      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
      toothPickJavaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }

  private static void createPokemonVersions() throws ClassNotFoundException, IOException {
    for(int i = 1; i < 16; i++) {
      TypeSpec.Builder pokemonVersion = TypeSpec.classBuilder(POKEMON_VERSION + i)
        .addModifiers(Modifier.PUBLIC);

      TypeSpec.Builder toothPickPokemonVersion = TypeSpec.classBuilder(POKEMON_VERSION + i)
        .addModifiers(Modifier.PUBLIC);

      MethodSpec.Builder constructorBuilder = MethodSpec.constructorBuilder()
        .addAnnotation(Inject.class)
        .addModifiers(Modifier.PUBLIC);

      for(int j = 1; j < 201; j++) {
        FieldSpec trainers = FieldSpec.builder(Class.forName(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addModifiers(Modifier.PUBLIC)
          .build();

        FieldSpec toothPickTrainers = FieldSpec.builder(Class.forName(TOOTHPICK_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        constructorBuilder
          .addParameter(Class.forName(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase() + "." + TRAINER + j), TRAINER.toLowerCase() + j)
          .addStatement("this.$N = $N", TRAINER.toLowerCase() + j, TRAINER.toLowerCase() + j);

        pokemonVersion.addField(trainers);
        toothPickPokemonVersion.addField(toothPickTrainers);
      }

      MethodSpec constructor = constructorBuilder.build();

      TypeSpec version = pokemonVersion
        .addMethod(constructor)
        .build();

      TypeSpec toothPickVersion = toothPickPokemonVersion
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + POKEMON_VERSION.toLowerCase(), version)
        .build();

      JavaFile toothPickJavaFile = JavaFile.builder(TOOTHPICK_PACKAGE_PATH + "." + POKEMON_VERSION.toLowerCase(), toothPickVersion).build();

      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
      toothPickJavaFile.writeTo(new File(TOOTHPICK_APP_PATH));
      toothPickJavaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }

  private static void createTrainers() throws IOException, ClassNotFoundException {
    for(int i = 1; i < 201; i++) {
      TypeSpec.Builder trainerBuilder = TypeSpec.classBuilder(TRAINER + i)
        .addModifiers(Modifier.PUBLIC);

      TypeSpec.Builder toothPickTrainerBuilder = TypeSpec.classBuilder(TRAINER + i)
        .addModifiers(Modifier.PUBLIC);

      MethodSpec.Builder constructorBuilder = MethodSpec.constructorBuilder()
        .addAnnotation(Inject.class)
        .addModifiers(Modifier.PUBLIC);
      for(int j = 1; j < 7; j++) {
        FieldSpec pokemons = FieldSpec.builder(Class.forName(DAGGER_PACKAGE_PATH + "." + POKEMON.toLowerCase() + "." + POKEMON + j), POKEMON.toLowerCase() + j)
          .addModifiers(Modifier.PUBLIC)
          .build();

        FieldSpec toothPickPokemons = FieldSpec.builder(Class.forName(TOOTHPICK_PACKAGE_PATH + "." + POKEMON.toLowerCase() + "." + POKEMON + j), POKEMON.toLowerCase() + j)
          .addAnnotation(Inject.class)
          .addModifiers(Modifier.PUBLIC)
          .build();

        trainerBuilder.addField(pokemons);
        toothPickTrainerBuilder.addField(toothPickPokemons);

        constructorBuilder
          .addParameter(Class.forName(DAGGER_PACKAGE_PATH + "." + POKEMON.toLowerCase() + "." + POKEMON + j), POKEMON.toLowerCase() + j)
          .addStatement("this.$N = $N", POKEMON.toLowerCase() + j, POKEMON.toLowerCase() + j);
      }


      MethodSpec constructor = constructorBuilder.build();

      TypeSpec trainer = trainerBuilder
        .addMethod(constructor)
        .build();

      TypeSpec toothPickTrainer = toothPickTrainerBuilder
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + TRAINER.toLowerCase(), trainer)
        .build();

      JavaFile toothPickJavaFile = JavaFile.builder(TOOTHPICK_PACKAGE_PATH + "." + TRAINER.toLowerCase(), toothPickTrainer)
        .build();

      toothPickJavaFile.writeTo(new File(TOOTHPICK_APP_PATH));
      toothPickJavaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }

  private static void createPokemon() throws IOException {
    for(int i = 1; i < 7; i++) {
      FieldSpec name = FieldSpec.builder(String.class, "name")
        .addModifiers(Modifier.PUBLIC)
        .build();

      MethodSpec constructorBuilder = MethodSpec.constructorBuilder()
        .addAnnotation(Inject.class)
        .addModifiers(Modifier.PUBLIC)
        .addParameter(String.class, "name")
        .addStatement("this.$N = $N", "name", "name")
        .build();

      TypeSpec pokemon = TypeSpec.classBuilder(POKEMON + i)
        .addField(name)
        .addModifiers(Modifier.PUBLIC)
        .addMethod(constructorBuilder)
        .build();

      JavaFile javaFile = JavaFile.builder(DAGGER_PACKAGE_PATH + "." + POKEMON.toLowerCase(), pokemon)
        .build();

      JavaFile toothPickJavaFile = JavaFile.builder(TOOTHPICK_PACKAGE_PATH + "." + POKEMON.toLowerCase(), pokemon)
        .build();

      toothPickJavaFile.writeTo(new File(TOOTHPICK_APP_PATH));
      toothPickJavaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
      javaFile.writeTo(new File(DAGGER_APP_PATH));
      javaFile.writeTo(new File(DAGGER_GENERATOR_PATH));
    }
  }
}
