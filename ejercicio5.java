import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) {
        double gramos, temperatura, C, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la cantidad de Gramos de agua" + "\n");
        Scanner teclado = new Scanner(System.in);
        gramos = teclado.nextDouble();
     
        System.out.print("Digita la temperatura en grados centigrados a la que quiere elevar esa cantidad de agua" + "\n");
        temperatura = teclado.nextDouble();
        
        //Tomando un valor constante la capacidad calorica asumimos que
        C = 4200;
        
        resultado = gramos * C * temperatura;
  
        System.out.print("La cantidad total de energia necesaria para aumentar a : " + temperatura + " grados, los " + gramos +
        " gramos de agua es de: " + resultado + " J");
        
    }
}