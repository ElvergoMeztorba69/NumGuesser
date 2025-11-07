import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        int max=100, min=1;

        int randomNum = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println("UN NOMBRE SECRET \nS'HA GENERAT.\nINTENTA ENDEVINAR \nEL NOMBRE.");

        int inputNum = input1.nextInt();

        System.out.println("EL NOMBRE \nQUE HAS INTRODUIT \nÉS " + inputNum + ".");

        if(randomNum == inputNum){

            System.out.println("\nENHORABONA.\nSEMBLA QUE HAS\nENCERTAT EL NOMBRE.");

        }

        else {

            System.out.println("\n...\nQUE INTERESSANT.\n...\nEM SEMBLA,\nQUE NO HAS ENCERTAT\nEL NOMBRE.");

            System.out.println("\n...\nTOT I AIXÒ.\n\nHE DECIDIT, DONAR-TE\nUNA SEGONA\nOPORTUNITAT.");
        

            

            if(inputNum > randomNum) {

                System.out.println("\nET DONARÉ\nUNA PISTA.\n\nEL TEU NOMBRE\nÉS MÉS PETIT\nQUE EL NOMBRE GENERAT.");

            }

            else{

                System.out.println("\nET DONARÉ\nUNA PISTA.\n\nEL TEU NOMBRE\nÉS MÉS GRAN\nQUE EL NOMBRE GENERAT.");

            }


            System.out.println("\n...ARA.\nARA, INTENTA ENDEVINAR\n EL NOMBRE.");

            int inputNum2 = input1.nextInt();

            if(randomNum == inputNum2){

                System.out.println("\nENHORABONA.\nSEMBLA QUE HAS\nENCERTAT EL NOMBRE.");

            }

            else{

                System.out.println("...QUE INTERESSANT....EM SEMBLA,QUE NO HAS ENCERTATEL NOMBRE. QUE PRINGAO.");

            }



        }

        input1.close();

    }
}
