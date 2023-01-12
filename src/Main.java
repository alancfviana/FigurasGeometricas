public class Main {
    public static void main(String[] args) {

        double lado1 = 2;
        double lado2 = 4;
        double raio = 5;

        Retangulo retangulo = new Retangulo(lado1, lado2 , "azul");
        Quadrado quadrado = new Quadrado(lado1, "verde");
        Triangulo triangulo = new Triangulo(lado1, lado2, "amarelo");
        Circulo circulo = new Circulo(raio, "vermelho");
        System.out.println(retangulo.toString());
        System.out.println(quadrado.toString());
        System.out.println(triangulo.toString());
        System.out.println(circulo.toString());
    }
}