
// Day 2
// https://www.youtube.com/watch?v=uDwg5F_rW18&feature=youtu.be
// To Run in CMD
// cd C:\Users\KWANGKAEWAkanit\Google Drive\CODE

/*
3 Big steps of Creating Variables
  1. Declare
  2. Allocate
  3. Initalize

*/

// package Car;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Car{
  //Object : Properties + Methods
  /*
All variable here are call "instant variables";
  */
  int maxSpeed = 100;
  int minSpeed = 0;

  double weight = 4079;

  boolean isTheCarOn = false;
  char condition = 'A';
  String nameOfCar ="Lucky";

  double maxFuel = 16;
  double currentFuel = 8;
  double mpg = 26.4;

  int numberOfPeopleInCar = 1;

  //Name must match with the lass name
  //f(x) = x + 1;
  //Say x = 5;
  //f(5) = 5 + 1 = 6;
  public Car (int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
    maxSpeed = customMaxSpeed;
    weight = customWeight;
    isTheCarOn = customIsTheCarOn;
  }

  /*
All methods here are call "instant methods";
  */


  public void printVariables() {
    System.out.println("This is the maxSpeed " + maxSpeed);
    System.out.println(minSpeed);
    System.out.println(weight);
    System.out.println(isTheCarOn);
    System.out.println(condition);
    System.out.println(nameOfCar);
    System.out.println(numberOfPeopleInCar);
  }

  // changeCondition
  public void changeCondition(){
    condition = 'C';
  }
  public void upgradeMinSpeed(){
    minSpeed = maxSpeed;
    maxSpeed = maxSpeed+1;
  }

  public void getIn(){
    // numberOfPeopleInCar  = numberOfPeopleInCar + 1;
    numberOfPeopleInCar ++;
  }

  public void getOut(){
    // numberOfPeopleInCar  = numberOfPeopleInCar - 1;
    numberOfPeopleInCar --;
  }
  public double howManyMileTillOutOfGas() {
    return currentFuel * mpg;
  }

  public double maxMilePerFillUp(){
    return maxFuel * mpg;
  }

  //Methods
  public static void main(String[] args) {

      // TOD code application logic here
      Car birthdayPresent = new Car(500, 5000.545, true);
      System.out.println("Birthday Car");
      birthdayPresent.printVariables();
      birthdayPresent.getIn();
      birthdayPresent.getIn();
      birthdayPresent.getIn();


      System.out.println("Mile Left:" + birthdayPresent.howManyMileTillOutOfGas());
      System.out.println("Max Miles:"+ birthdayPresent.maxMilePerFillUp());
      System.out.println("Birthday Car V2");
      birthdayPresent.getOut();
      System.out.println("Birthday Car V3");
      birthdayPresent.printVariables();

      // System.out.println("christmasPresent");
      // Car christmasPresent = new Car(550, 2000, false);
      // christmasPresent.printVariables();


  }
}
