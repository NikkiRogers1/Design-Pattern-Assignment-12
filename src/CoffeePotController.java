public class CoffeePotController {
    
    private CoffeePotModel model;
    private CoffeePotView view;

    public CoffeePotController(CoffeePotModel model, CoffeePotView view) {

        this.model = model;
        this.view = view;
    }

    public void start() {

    while (true) {
        view.showMenu();
        String userInput = view.getUserInput();

        if (userInput.equals("exit")) {
            break;
        }

        String[] commands = userInput.split(" ");

        if (commands[0].equals("status")) {
            view.displayMessage("Current volume: " + model.getCurrentVolume());
            continue;
        }

        try {

            if (commands[0].equals("brew") || commands[0].equals("pour")) {

                if (commands.length < 2) {
                    view.displayMessage("Please enter a command and an amount.");
                    continue;
                }

                int amount = Integer.parseInt(commands[1]);

                if (commands[0].equals("brew")) {
                    model.brew(amount);
                }
                else {
                    model.pour(amount);
                }

                view.displayMessage("Current volume: " + model.getCurrentVolume() + " oz.");
            }
            else {
                view.displayMessage("Invalid command. Please try again.");
            }

        }
        catch (IllegalStateException e) {
            view.displayMessage("The amount would put the coffee pot outside its allowed limits.");
        }

        catch (IllegalArgumentException e) {
            view.displayMessage("Invalid amount. Please enter a valid number.");
        }
    }
}
}
