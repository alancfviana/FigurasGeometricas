public class Circulo extends Figura{
    private double raio;

    protected double area = 0;

    public Circulo(double raio, String cor) {
        this.cor = cor;
        this.raio = raio;
        this.area = 2*raio*Math.PI;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return raio*2;
    }

    private void area(){

        System.out.println("A área do retândulo é de " + area);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio = " + raio +
                ", area = " + area +
                ", cor = " + cor +
                '}';
    }
}
