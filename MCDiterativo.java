import java.util.Scanner;

public class MCDiterativo {
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int valor1= scanner.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int valor2= scanner.nextInt();

        int mcd = calcularMCD(valor1, valor2);
        
        System.out.print("El maximo comun divisor de "+ valor1+ " y "+valor2+" es = "+mcd);
    }

    public static int calcularMCD(int num1 , int num2){
        while (num2 != 0){
            int resultado= num2;
            num2= num1 % num2;
            num1 = resultado;
        }
        return num1;
    }
    
}
