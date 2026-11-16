public class Main {
    public static void main(String[] args) {
       
        CoffeePotModel pot1 = new CoffeePotModel(40);

        System.out.println("Starting pot Volume: " + pot1.getCurrentVolume() + " oz.");

        CoffeePotView view = new CoffeePotView();

        CoffeePotController controller = new CoffeePotController(pot1, view);

        controller.start();
        
       
    }
}
