
package git;

import java.util.Scanner;


public class Git {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a+b;
        System.out.println(total+"hola");
        if (total!=10){
            System.out.println("Intente nuevamente");
        }else{
            System.out.println("Correcto");
        }
    }
    
}
