import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        int max=100, min=1;

        int randomNum = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println("UN NOMBRE SECRET \nS'HA GENERAT.\nINTENTA ENDEVINAR \nEL NOMBRE.");

        boolean matchFound = false;

        while(!matchFound) {

            try {

                System.out.println("INTRODUEIX UN NOMBRE \nENTRE EL " + min + "\nI EL " + max + ".");

                int inputNum = input1.nextInt();

                if (inputNum < min || inputNum > max){

                    System.out.println("...\nEL NOMBRE QUE HAS INTRODUÏT\nNO ES TROBA \n DINS ELS LIMITS");
                    continue;

                }

                if (randomNum == inputNum) {

                    System.out.println("\nENHORABONA.\nSEMBLA QUE HAS\nENCERTAT EL NOMBRE.");

                    matchFound = true;

                }

                else if (inputNum > randomNum) {

                    System.out.println("\n...\nPERÒ EL NOMBRE\nNO ERA CORRECTE.");

                    System.out.println("\nET DONARÉ\nUNA PISTA.\n\nEL TEU NOMBRE\nÉS MÉS GRAN\nQUE EL NOMBRE GENERAT.");

                    max = inputNum - 1;

                    System.out.println("INTRODUEIX UN NOMBRE \nENTRE EL " + min + "\nI EL " + max + ".");

                }

                else {

                    System.out.println("\n...\nPERÒ EL NOMBRE\nNO ERA CORRECTE.");

                    System.out.println("\nET DONARÉ\nUNA PISTA.\n\nEL TEU NOMBRE\nÉS MÉS PETIT\nQUE EL NOMBRE GENERAT.");

                    min = inputNum + 1;

                    System.out.println("INTRODUEIX UN NOMBRE \nENTRE EL " + min + "\nI EL " + max + ".");

                }

            }

            catch (InputMismatchException e) {

                System.out.println("...\nPERÒ NO ES VA INTRODUÏR UN NOMBRE.");

            }

        }

        input1.close();

        //Buh-bye!

    }
}
