public class Car {

    private float velocidadeMaxima;
    private String modelo;
    private int quantidadeDeAssentos;
    private float velocidadeAtual; // New attribute to track movement

    public Car(String modelo, int quantidadeDeAssentos, float velocidadeMaxima) {
        this.modelo = modelo;
        this.quantidadeDeAssentos = quantidadeDeAssentos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerarCarro(float incremento) {
        if (velocidadeAtual + incremento <= velocidadeMaxima) {
            velocidadeAtual += incremento;
            System.out.println("The " + modelo + " accelerated to " + velocidadeAtual + " km/h.");
        } else {
            velocidadeAtual = velocidadeMaxima;
            System.out.println("Top speed reached: " + velocidadeMaxima + " km/h!");
        }
    }

    public void abrirPorta() {
        if (velocidadeAtual == 0) {
            System.out.println("The doors of the " + modelo + " are now open.");
        } else {
            System.out.println("Safety Warning: Cannot open doors while the car is moving!");
        }
    }

    public int getQuantidadeDeAssentos() {
        return quantidadeDeAssentos;
    }

    public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }

    public String getModelo() {
        return modelo;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}