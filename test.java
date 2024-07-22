
package test;

public class test {
      public static void main(String[] args) {
    
//create only one object
ChocolateBoiler boiler = ChocolateBoiler.getInstance();

// fill after check 
if (boiler.isEmpty()) {
            boiler.fill();
            System.out.println("The boiler has been filled.");
        } else {
            System.out.println("The boiler is already filled.");
        }

        // boil
        boiler.boil();
        if (boiler.isBoiled()) {
            System.out.println("The contents of the boiler have been boiled.");
        } else {
            System.out.println("The contents of the boiler are not boiled yet.");
        }

        // empty
        boiler.drain();
        if (boiler.isEmpty()) {
            System.out.println("The boiler has been drained.");
        } else {
            System.out.println("The boiler is not empty.");
        }

        // to prove that only one instance can made
        ChocolateBoiler sameBoiler = ChocolateBoiler.getInstance();
        if (boiler == sameBoiler) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("The references point to different instances.");
        }
    }
}