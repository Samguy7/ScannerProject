
/**
 *
 * @author sam
 */
import java.util.Scanner;
import java.util.*;

public class ScannerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Thank you for visiting " + firstName);
    }

}
