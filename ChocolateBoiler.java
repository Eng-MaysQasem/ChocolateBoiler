package test;

/*By using the Singleton pattern, we ensure that we only have one copy of the ChocolateBoiler running at any given time. This ensures that the operations performed on the boiler are consistent and do not conflict with each other. This pattern helps in managing resources effectively and avoiding problems caused by duplication.
Imagine if there were more than one kettle in the same factory, and there was a worker filling one and boiling another, this could lead to a loss of control in the production process, thus causing loss of materials or an error in the process. By using Singleton, we ensure that all processes take place on the same boiler, so we can control the process more effectively.
 */

public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;
    //I made the constructor private to prevent access to it outside the class

    private ChocolateBoiler() {

    }

    //to make only one instance
    public static ChocolateBoiler getInstance() {

        if (uniqueInstance == null) {

            uniqueInstance = new ChocolateBoiler();//lazy intilization create when request

        }

        return uniqueInstance;

    }

    public void fill() {

        if (isEmpty()) {

            // fill the boiler with a milk
            empty = false;

            boiled = false;

        }

    }

    public void drain() {

        if (!isEmpty() && isBoiled()) {

            // drain the boiled milk and chocolate
            empty = true;

        }

    }

    public void boil() {

        if (!isEmpty() && !isBoiled()) {

            // bring the contents to a boil
            boiled = true;

        }

    }

    public boolean isEmpty() {

        return empty;

    }

    public boolean isBoiled() {

        return boiled;

    }
}
