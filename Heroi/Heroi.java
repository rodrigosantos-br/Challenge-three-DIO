import java.util.Scanner;
public class Heroi {
    private static String nome;
    private static int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    public void atacar() {
        System.out.println(String.format("o %s atacou usando %s", this.tipo, this.getAtaque()));
    }

    private String getAtaque() {
        switch (this.tipo) {
            case "mago":
                return "magia";
            case "guerreiro":
                return "espada";
            case "monge":
                return "artes marciais";
            case "ninja":
                return "shuriken";
            default:
                return "ataque desconhecido";
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do herói?");
        String nome = scanner.nextLine();

        System.out.println("Qual é a idade do herói?");
        int idade = scanner.nextInt();

        System.out.println("Qual é o tipo do herói? (mago, guerreiro, monge, ninja)");
        String tipo = scanner.next();

        Heroi heroi = new Heroi(nome, idade, tipo);

        heroi.atacar();

    }
}
