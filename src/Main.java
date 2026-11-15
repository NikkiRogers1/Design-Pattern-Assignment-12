public class Main {
    public static void main(String[] args) {
       
        CoffeePotModel pot1 = new CoffeePotModel(40);

        System.out.println("Starting pot Volume: " + pot1.getCurrentVolume() + " oz.");

        pot1.brew(10);
        System.out.println("After Brew: " + pot1.getCurrentVolume() + " oz.");

        pot1.pour(5);
        System.out.println("After  Pour: " + pot1.getCurrentVolume() + " oz.");

    
        pot1.brew(-5);
        System.out.println(pot1.getCurrentVolume());



    }
}
