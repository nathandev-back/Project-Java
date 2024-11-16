import java.util.Scanner;

public class Calculation {
    public static void Calculadora() {
        System.out.println("""
                =======Olá, Bem vindo à calculadora=======
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                ==========================================
                """);
        System.out.print("Escolha a opção que deseja: ");
        Scanner scanner = new Scanner(System.in);
        int optionSelect = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        switch (optionSelect) {
            case 1 -> {
                int sum = num1 + num2;
                System.out.println("A soma dos dois números é: " + sum);
            }
            case 2 -> {
                int sub = num1 - num2;
                System.out.println("A subtração dos dois números é: " + sub);
            }
            case 3 -> {
                int mul = num1 * num2;
                System.out.println("A multiplicação dos dois números é: " + mul);
            }
            case 4 -> {
                if (num2 != 0) {
                    int div = num1 / num2;
                    System.out.println("A divisão dos dois números é: " + div);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
            }
            default -> System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 4.");
        }
    }
}
