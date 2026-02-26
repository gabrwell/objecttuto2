public class Car {

    float velocidadeMaxima;
    String modelo;
    int quantidadeDeAssentos;
    float velocidadeAtual; // New attribute to track movement

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
}