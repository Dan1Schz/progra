import java.util.Scanner;


public class prueba {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int n = sc.nextInt();

        Figuras f = new Figuras();

        System.out.println("\nFigura 1:");
        f.imprimirFigura1(n);

        System.out.println("\nFigura 2:");
        f.imprimirFigura2(n);

        System.out.println("\nFigura 3:");
        f.imprimirFigura3(n);

        System.out.println("\nFigura 4:");
        f.imprimirFigura4(n);

        System.out.println("\nFigura 5:");
        f.imprimirFigura5(n);
    }
}
