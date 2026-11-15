
import java.util.Scanner;

public class CoffeePotView {
    
    public void showMenu() {
        System.out.println("brew <amt> " );
        System.out.println("pour <amt> ");
        System.out.println("status ");
        System.out.println("exit ");

       
    }
     public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
        }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}
