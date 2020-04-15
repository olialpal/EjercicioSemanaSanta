
public class Ejer4 {
    public static void main(String[] args){
        comparacion();
    }
    private static void comparacion() {
        int n=2;
        int x=6;
        if (n<x){
            System.out.println("Soy el cambio que crea conflicto en el primer ambiente");
        }
            else {
            System.out.println("Soy el cambio en este nuevo workspace");
        }
    }}
