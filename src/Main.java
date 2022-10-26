import java.util.Objects;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Olá! Neste programa você digitará números e depois calcularei a média aritmética ou harmônica entre eles");
            System.out.println("Primeiro, digite a quantidade de números que serão usados no cálculo");
            Scanner entrada = new Scanner(System.in);
            int quantidade = pegaNumInt();
            double[] lista = new double[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o " + (i + 1) + "º" + " número");
                lista[i] = pegaNumDouble();
            }

            System.out.println("Agora, escolha a operação que deseja");
            System.out.println("para média aritmética, digite: ARITMETICA");
            System.out.println("para média harmônica, digite: HARMONICA");
            String media = entrada.nextLine();


            double soma = 0;
            int nElementos = lista.length;

            boolean sair = false;
            while(!sair) {

                if (Objects.equals(media, "ARITMETICA")) {
                    System.out.print("Números digitados: ");

                    for (int i = 0; i < quantidade; i++) {
                        soma += lista[i];
                        System.out.print(lista[i] + " ");
                    }
                    System.out.println("");
                    System.out.println("A média escolhida foi a aritmética!");
                    System.out.println("Média: " + (soma / nElementos));
                    sair = true;

                } else if (Objects.equals(media, "HARMONICA")) {
                    System.out.print("Números digitados: ");

                    for (int i = 0; i < quantidade; i++) {
                        soma += lista[i];
                        System.out.print(lista[i] + " ");
                    }
                    double somaInversa = 0;
                    for (int i = 0; i < quantidade; i++) {
                        lista[i] = 1 / lista[i];
                        somaInversa += lista[i];
                        sair = true;
                    }
                    System.out.println("");
                    System.out.println("A média escolhida foi a harmônica!");
                    System.out.println("Média: " + (nElementos / somaInversa));
                }
                else {
                    System.out.println("Valor inválido!");
                    System.out.println("para média aritmética, digite: ARITMETICA");
                    System.out.println("para média harmônica, digite: HARMONICA");
                    media = entrada.nextLine();
                }
            }

            }
    static double pegaNumDouble() {
        Scanner scan =new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            System.out.println("Imput inválido. Por favor, digite um número");
            scan.nextLine();
        }
        return scan.nextDouble();

    }

    static int pegaNumInt() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.println("Imput inválido. Por favor, digite um número inteiro");
            scan.nextLine();
        }
        return scan.nextInt();
    }

    }







// harmônica :  dividir pelo inverso de n somar inversos e