public class Retangulo extends Figura{

    protected double lado1;
    protected double lado2;

    protected double area = 0;

    public Retangulo(double lado1, double lado2, String cor){
        this.cor = cor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        area = lado1*lado2;
        }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    private void area(){

        System.out.println("A área do retândulo é de " + area);
    }



    @Override
    public String toString() {
        return "Retangulo{" +
                "lado 1 = " + lado1 +
                ", lado 2 = " + lado2 +
                ", area = " + area +
                ", cor = " + cor +
                "}";
    }
}
