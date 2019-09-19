import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      int digit;

      highwayNumber = scnr.nextInt();
      
      
      do {
         if (highwayNumber % 2 == 0) {
            System.out.println("The " + highwayNumber + " primary, going east/west.");
            break;
         } else if (highwayNumber % 2 == 1) {
            System.out.println("The " + highwayNumber + " primary, going north/south.");
            break;
         }
      } while ((highwayNumber <= 99) && (highwayNumber >= 1));

      
      do {
         digit = highwayNumber % 100;
         System.out.println("The " + highwayNumber + " is auxiliary, serving the " + digit + ", going east/west.");
         break;
      } while ((highwayNumber <= 999) && (highwayNumber >= 100));
      
   }
}
