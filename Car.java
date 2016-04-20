
package car;

/**
 *
 * @author Megalin
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;  /* in pounds */
    
    boolean isOn = false;
    char condition = 'A';
    String nameOfCar = "Megan";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 28.4;
    
    int numberOfPeopleInCar = 1;
    
    public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) {
    minSpeed = customMinSpeed;
    weight = customWeight;
    isOn = customIsTheCarOn;
    
}
    
    
    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println("This is the min speed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("The car is on: " + isOn);
        System.out.println("The car is in condition " + condition);
        System.out.println("Name of car: " + nameOfCar);
        System.out.println("Number of people in car: " + numberOfPeopleInCar);
    }
    
    public void wreckCar() {
        condition = 'C';
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
        
    }
    
    public void getIn() {
        numberOfPeopleInCar++;
    }
    
    public void getOut() {
        numberOfPeopleInCar--;
    }
    
    public double howManyMilesTilOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }


    public static void main(String[] args) {
        // TODO code application logic here
       Car birthdayPresent = new Car(500, 500.45, true);
        System.out.println("Birthday Car V1:");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: "+ birthdayPresent.howManyMilesTilOutOfGas());
        System.out.println("Max Miles: "+ birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car V2:");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car V3:");
        birthdayPresent.printVariables();
        /*        System.out.println("Christmas Car");
        Car christmasPresent = new Car(550, 2000, false);
        christmasPresent.printVariables();
        */
    }
    
}
