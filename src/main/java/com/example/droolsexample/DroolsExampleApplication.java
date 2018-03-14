package com.example.droolsexample;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DroolsExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(DroolsExampleApplication.class, args);
  }

  @Bean
  public KieContainer kieContainer() {
    KieServices kieServices = KieServices.Factory.get();
    return kieServices.getKieClasspathContainer();
  }
}
