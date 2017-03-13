package com.example;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.lang.model.element.Modifier;

public class Generator {
  public static void main(String[] args) throws IOException {
    System.out.println("PokemonWorldChampionship DI framework comparison code generation begins!");

    for(int i = 1; i < 7; i++) {
      TypeSpec pokemon = TypeSpec.classBuilder("Pokemon" + i)
        .addModifiers(Modifier.PUBLIC)
        .build();

      JavaFile javaFile = JavaFile.builder("info.kimjihyok.pokemonworldchampionship.generated.pokemon", pokemon)
        .build();

      // File
      File newFile = new File("app/src/main/java/");
      System.out.println("Path: " + newFile.getAbsolutePath() + " " + newFile.getName() + " ");
      javaFile.writeTo(newFile);
    }
  }
}
