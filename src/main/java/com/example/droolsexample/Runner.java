package com.example.droolsexample;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

  private final KieContainer kieContainer;

  public Runner(KieContainer kieContainer) {
    this.kieContainer = kieContainer;
  }

  @Override
  public void run(String... args) {

    StatelessKieSession kSession = kieContainer.newStatelessKieSession();

    Applicant youngApplicant = new Applicant( "John Smith Jr", 16 );
    Applicant adultApplicant = new Applicant("Mr John Smith", 30);

    List<Applicant> applicants = Arrays.asList(youngApplicant, adultApplicant);

    System.out.println( "before: " + applicants );

    kSession.execute(applicants);

    System.out.println( "after: " + applicants );
  }

}
