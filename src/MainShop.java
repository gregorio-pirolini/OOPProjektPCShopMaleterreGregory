
import java.util.Scanner;

public class MainShop {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("PC-Shop \t\t Hauptmenü \t\t von Greg Maleterre");
        System.out.println("----------------------------------------------------");
        System.out.println("1) Produkt anlegen");
        System.out.println("2) Produkt bearbeiten");
        System.out.println("3) Produkt suchen");
        System.out.println("4) Produkt löschen");
        System.out.println("0) shop beenden");
        System.out.println("----------------------------------------------------");
        System.out.println("Bitte wählen");

        hauptMenue();
    }

    public static void hauptMenue(){
        String entry = scanner.next();
        switch (entry){
            case "1":
                System.out.println("Produkt anlegen!!");
                produktAnlegen();
                break;
            case "2":
                System.out.println("Produkt bearbeiten!!");
                main(null);
                break;
            case "3":
                System.out.println("Produkt suchen!!");
                main(null);
                break;
            case "4":
                System.out.println("Produkt löschen!!");
                main(null);
                break;
            case "0":
                System.out.println("shop beenden!!");
                main(null);
                break;
            default:
                System.out.println("Fehlerhafte Eingabe!!");
                main(null);
        }

    }

    private static void produktAnlegen() {

        boolean validation = false;

        while(!validation)
             {
                System.out.println("----------------------------------------------------");
                System.out.println("PC-Shop \t\t Produkt anlegen \t\t von Greg Maleterre");
                System.out.println("----------------------------------------------------");
                System.out.println("1) Monitor");
                System.out.println("2) Motherboard");
                System.out.println("3) Tastatur");
                System.out.println("4) Mouse");
                System.out.println("----------------------------------------------------");
                System.out.println("Bitte wählen");

                 String entry2 = scanner.next();
                 switch (entry2){
                     case "1":
                         System.out.println("Monitor!!");
                         validation = true;
                         break;
                     case "2":
                         System.out.println("Motherboard!!");
                         validation = true;
                         break;
                     case "3":
                         System.out.println("Tastatur!!");
                         validation = true;
                         break;
                     case "4":
                         System.out.println("Mouse!!");
                         validation = true;
                         break;
                     default:
                         System.out.println("Produkt anlegen Fehlerhafte Eingabe!!");
                 }


            }

    }
}