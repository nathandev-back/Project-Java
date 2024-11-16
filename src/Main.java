import java.util.Scanner;

public class Main {
    public static void main(String [] agrs)
    {

        boolean Exit;

        do {


            Scanner scanner = new Scanner(System.in);

            System.out.print("""
                    =================================
                            Bem vindo Ao Menu
                    1 - Area de contagem Maior/Menor
                    2 - Area da Calculadora
                    3 - Area de Conversor da Conta Fabonacci
                    4 - Sair do Menu
                    =================================
                    """);

            System.out.print("Digite a opção que deseja: ");
            int optionMenu = scanner.nextInt();
            switch (optionMenu) {
                case 1 -> {
                    biggerNumber.metodoBigger();
                }
                case 2 -> {
                    Calculation.Calculadora();
                }
                case 3 -> {
                    fabor.Fabonacci();
                }
                case 4 -> {
                    Exit = false;
                    break;

                }

            }


        }while(false);
        System.out.print("Voce saiu do menu, obrigado por utilizar nosso programa");


    }
}