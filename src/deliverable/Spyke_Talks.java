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
        int[] idsOrganize = bubble(ids);//Se llama al metodo bubble para que organice el arreglo
        count(idsOrganize);
    }

    //Metodo que consiste en organizar los numeros registrados
    public static int[] bubble(int[] arr){
        for (int j=0; j < arr.length; j++){
            for (int i=1; i < arr.length; i++){
                if (arr[i-1] < arr[i]){
                    int last = arr[i-1];
                    int current = arr[i];
                    arr[i] = last;
                    arr[i-1] = current;
                }
            }
        }
        return arr;
    }
    //metodo que consiste en contar los numeros pares y lanzar -1 si hay más de dos pares
    public static void count(int[] arr){
        for (int j=0; j < arr.length; j++){
            for (int i=1; i < arr.length; i++){
                if (arr[i-1] == arr[i]){

                }
            }
        }
    }
}
