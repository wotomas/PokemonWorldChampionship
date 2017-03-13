package com.example;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

import javax.lang.model.element.Modifier;

public class Generator {
  public static void main(String[] args) throws IOException {
    System.out.println("PokemonWorldChampionship DI framework comparison code generation begins!");

    MethodSpec main = MethodSpec.methodBuilder("main")
      .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
      .returns(void.class)
      .addParameter(String[].class, "args")
      .addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
      .build();

    TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
      .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
      .addMethod(main)
      .build();

    JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
      .build();

    // File
    javaFile.writeTo(new File(URI.create("../")));
  }
}
