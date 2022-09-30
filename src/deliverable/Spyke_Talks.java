package deliverable;

import java.util.Scanner;

public class Spyke_Talks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//Se inserta la cantidad de numeros que ingresan
        int[] ids = new int[n];//Arreglo qu estaran los numeros

        for (int i=0; i< ids.length; i++){//ciclo para ingresar los numeros ids en el arreglo
            ids[i] = sc.nextInt();
        }
        for(int number : ids){
            System.out.println(number);
        }
    }
}
