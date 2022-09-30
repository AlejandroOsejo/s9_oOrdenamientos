package deliverable;

import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String unsorted = sc.nextLine(); //Se escribe la linea de suma
        String[] numbers = unsorted.split("\\+");//para dividir el String por numeros, se divide por el +

        bubble(numbers);//Se llama al metodo bubble para que organice la lista de numbers
        String ans = "";
        for (int i = 0; i<numbers.length; i++){//ciclo for para concatenar las + y para que quede en una linea de String
            ans += numbers[i] + "+";
        }
        System.out.println(ans.substring(0, ans.length()-1));// consiste para cortar el ultimo String

    }

    // metodo que consiste en el organizamiento del la linea
    public static void bubble(String[] arr){
        for (int j = 0; j < arr.length; j++) {
           for (int i = 1; i < arr.length-j; i++) {
                if (arr[i-1].compareTo(arr[i]) > 0) {
                    String last = arr[i-1];
                    String current = arr[i];
                    arr[i] = last;
                    arr[i-1] = current;
                }
            }
        }
    }


}
