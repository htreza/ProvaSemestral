package provasemestralyoshi;

//Powered by Henrique Treza
import java.util.Scanner;

public class ProvaSemestralYoshi {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] urnaEletronica = new int[4];
        int votosCalculados = 0;

        while (votosCalculados < 3) {
            System.out.println("Digite a quantidade de pessoas que irão votar");
            votosCalculados = leitor.nextInt();
        }

        for (int i = 0; i < votosCalculados; i++) {
            System.out.println("Escolha o seu Cantor(a):\n"
                    + "1 - Justin Bieber\n"
                    + "2 - Lady Gaga\n"
                    + "3 - Voto em Branco");
            String cantores = leitor.next();

            switch (cantores) {
                case "1":
                    urnaEletronica[0]++;
                    break;
                case "2":
                    urnaEletronica[1]++;
                    break;
                case "3":
                    urnaEletronica[2]++;
                    break;
                default:
                    urnaEletronica[3]++;
                    break;
            }
        }

        System.out.println("Quantidade de votos: " + votosCalculados);

        System.out.println("Qtd de votos no Justin Bieber: " + urnaEletronica[0] + " (" + ((urnaEletronica[0])/votosCalculados*100));

        System.out.println("Qtd de votos na Lady Gaga: " + urnaEletronica[1] + " (" + ((urnaEletronica[1])/votosCalculados*100));

        System.out.println("Votos Brancos: " + urnaEletronica[2] + " (" + ((urnaEletronica[2])/votosCalculados*100));

        System.out.println("Votos Nulos: " + urnaEletronica[3] + " (" + ((urnaEletronica[3])/votosCalculados*100));

    }

}

