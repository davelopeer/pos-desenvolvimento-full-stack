public class Cao {
    String nome;
    String cor;
    private int idade;
    private double peso;

    public Cao(int idade, String nome) {
        cor = "Caramelo";
        this.nome = nome;
        this.idade = idade;
    } 

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }


    public int getIdade() {
        return this.idade;
    }

    public void Andar() {
        System.out.println("Andando...");
    }

    public boolean VerificarIdade() {
        if(idade >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
