import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** DETECTOR DE GOLPES ****");
        System.out.println("Digite uma mensagem:");

        String mensagem = scanner.nextLine();

        int sinais = 0;

        if (mensagem.toLowerCase().contains("urgente")) {
            sinais++;
        }

        if (mensagem.toLowerCase().contains("senha")) {
            sinais++;
        }

        if (mensagem.toLowerCase().contains("pix")) {
            sinais++;
        }

        if (mensagem.toLowerCase().contains("prêmio")) {
            sinais++;
        }

        if (mensagem.toLowerCase().contains("taxa")) {
            sinais++;
        }

        if (mensagem.toLowerCase().contains("clique aqui")) {
            sinais++;
        }

        System.out.println("Mensagem recebida:");
        System.out.println(mensagem);

        System.out.println("Quantidade de sinais: " + sinais);

        if (sinais >= 2) {
            System.out.println("ATENÇÃO: POSSÍVEL GOLPE!");
        } else {
            System.out.println("Mensagem classificada como: BAIXO RISCO.");
        }

        scanner.close();
    }
}
