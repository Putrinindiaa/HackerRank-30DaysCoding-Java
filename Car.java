
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
    
    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println("This is the min speed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("The car is on: " + isOn);
        System.out.println("The car is in condition " + condition);
        System.out.println("Name of car: " + nameOfCar);
    }
    
    public void wreckCar() {
        condition = 'C';
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
        
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        Car familyCar = new Car();
        System.out.println("Families car");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
         System.out.println("\nFamilies car");
        familyCar.printVariables();
        
    }
    
}
