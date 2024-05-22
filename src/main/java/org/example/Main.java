package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    ClassificationFilter classificationFilter = new ClassificationFilter();
    DurationCalculator durationCalculator = new DurationCalculator();

    Movie movie = new Movie();
    movie.setName("The Godfather");
    movie.setYear(1972);
    movie.setDuration(175);
    movie.setTotalReviews(8);
    movie.show();
    classificationFilter.filter(movie);
    durationCalculator.addDuration(movie);
    System.out.println("Recommendation: " + classificationFilter.getRecommendation());

    Movie lordOfTheRings = new Movie();
    lordOfTheRings.setName("The Lord of the Rings");
    lordOfTheRings.setYear(2001);
    lordOfTheRings.setDuration(201);
    lordOfTheRings.setTotalReviews(10);
    lordOfTheRings.show();
    classificationFilter.filter(lordOfTheRings);
    durationCalculator.addDuration(movie);
    System.out.println("Recommendation: " + classificationFilter.getRecommendation());

    Serie myHeroAcademia = new Serie();
    myHeroAcademia.setName("My Hero Academia");
    myHeroAcademia.setYear(2016);
    myHeroAcademia.setDuration(23);
    myHeroAcademia.setTotalReviews(9);
    myHeroAcademia.show();
    classificationFilter.filter(myHeroAcademia);
    durationCalculator.addDuration(movie);
    System.out.println("Recommendation: " + classificationFilter.getRecommendation());

    System.out.println("Total duration: " + durationCalculator.getTotalDuration());

    ArrayList<Title> titles = new ArrayList<>();
    titles.add(movie);
    titles.add(lordOfTheRings);
    titles.add(myHeroAcademia);

    System.out.println("Titles quantity: " + titles.size());
    System.out.println("Titles ArrayList: " + titles);

    breakLine();

    ArrayList<Person> persons = new ArrayList<>();
    Person person1 = new Person("Patrick Maciel", 34);
    Person person2 = new Person("Aline Martins", 35);
    persons.add(person1);
    persons.add(person2);

    System.out.println("Persons quantity: " + persons.size());
    System.out.println("Persons ArrayList: " + persons);
  }

  public static void breakLine() {
    System.out.println("");
    System.out.println("---------------------------");
    System.out.println("");
  }


}
