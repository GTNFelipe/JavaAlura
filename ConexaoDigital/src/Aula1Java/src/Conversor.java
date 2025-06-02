public class Conversor {
    public static void conversor(String[] args) {
        System.out.println("Olá, esse é o conversor dde Celsius para Fahrenheit.");

        double temperatura = 42.5;
        double conversaoDeCparaF = (temperatura * 1.8) + 32; // Celsius para Fahrenheit
        int fahrenheit = (int) conversaoDeCparaF;

        System.out.println( "30 Graus Célsius são: " + fahrenheit + " graus Fahrenheit");
    }
}
