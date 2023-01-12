public class Triangulo extends Figura{

    private double base;
    private double altura;

    private double area = 0;

    public Triangulo(double base, double altura, String cor){
        this.cor = cor;
        this.base = base;
        this.altura = altura;
        area = base*altura/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private void area(){

        System.out.println("A área do triângulo é de " + area);
    }



    @Override
    public String toString() {
        return "Triangulo{" +
                "base = " + base +
                ", altura = " + altura +
                ", area = " + area +
                ", cor = " + cor +
                "}";
    }
}
