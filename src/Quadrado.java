public class Quadrado extends Retangulo{

    public Quadrado(double lado, String cor){
        super(lado, lado, cor);
        this.lado1 = lado;
        this.lado2 = lado;
        this.area = lado*lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado = " + lado1 +
                ", área = " + area +
                ", cor = " + cor +
                '}';
    }
}
