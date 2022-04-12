package Items;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author tomwi
 */
public class Main {
    public static void main(String[] args) {
        Orders order = new Orders();
        int idCounter = 1;
        
        int choice;
        
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n1. Add product");
            System.out.println("2. Show summary");
            System.out.println("3. Show total price");
            System.out.println("0. Quit");
            choice = scan.nextInt();
        
            switch(choice){
                case(1):
                    System.out.println("1. Chair");
                    System.out.println("2. Table");
                    System.out.println("3. Desk");
                    int furnitureChoice = scan.nextInt();
                    
                    switch(furnitureChoice){
                        case(1):
                            System.out.println("With armrests?");
                            System.out.println("1: Yes");
                            System.out.println("2: No");
                            Armrests arms = Armrests.valueOf(scan.next()
                                    .toUpperCase());
                            
                            System.out.println("What wood would you like?");
                            System.out.println("1: Oak");
                            System.out.println("2: Walnut");
                            WoodType wood = WoodType.valueOf(scan.next()
                                    .toUpperCase());
                            
                            
                            
                            Chair myChair = new Chair(arms,wood, 1, 
                                    idCounter);
                            order.addProduct(myChair);
                            idCounter++;
                        break;
                        case(2):
                            System.out.println("Table size: ");
                            double diameter = scan.nextInt();
                            
                            System.out.println("Base type: ");
                            System.out.println("Wooden");
                            System.out.println("Chrome");
                            BaseType base = BaseType.valueOf(scan.next()
                                    .toUpperCase());
                            
                            System.out.println("What wood would you like?");
                            System.out.println("1: Oak");
                            System.out.println("2: Walnut");
                            wood = WoodType.valueOf(scan.next().toUpperCase());
                            
                            
                        Table myTable = new Table(diameter, wood, base, 1, 
                                idCounter);
                            order.addProduct(myTable);  
                            idCounter++;
                        break;
                        case(3):
                            System.out.println("Number of drawers:");
                            int drawers = scan.nextInt();
                            
                            System.out.println("Height cannot be changed and is"
                                    + "set to 80cm");
                            System.out.println("What width would you like?");
                            int deskWidth = scan.nextInt();
                            System.out.println("What Depth would you like?");
                            int deskDepth = scan.nextInt();
                            
                            System.out.println("What wood would you like?");
                            System.out.println("1: Oak");
                            System.out.println("2: Walnut");
                            wood = WoodType.valueOf(scan.next().toUpperCase());
                            
                            
                            Desk myDesk = new Desk(drawers, deskWidth ,deskDepth,
                                    wood, 1, idCounter);
                            order.addProduct(myDesk);
                            idCounter++;
                        break;
                    }
                    break;
                case(2):
                    System.out.println(order.summary());

                    break;
                case(3):
                    DecimalFormat dFormat = new DecimalFormat("#.00");
                    System.out.println("£" + dFormat.format(order.getTotalPrice()));

                    break;
                case(0):
                    Furniture f = order.getItem(0);
                    //order.removeItem();
                    break;
                default:
                    break;
            }
        }
        while(choice != -1);
    }   
    
    
}
