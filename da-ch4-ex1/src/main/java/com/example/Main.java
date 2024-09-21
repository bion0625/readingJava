package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

}
/**
 *
 * 실행 명령어
 *
 * java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 .\target\da-ch4-ex1-0.0.1-SNAPSHOT.jar
 *
 * */