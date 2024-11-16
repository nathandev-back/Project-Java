import java.util.Scanner;

public class biggerNumber {
    public static void metodoBigger()
    {
        // exercicio numero 2

        int[] armazemNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite 5 numeros que o programa irá armazenar");

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Digite o " + (i+1) +"° numero: ");
            armazemNumbers[i] = scanner.nextInt();


        }
        System.out.println("Os Numeros digitados são: ");
        for(int i : armazemNumbers)
        {
            System.out.println(i + " ");

        }
        int Maior = armazemNumbers[0];
        int Menor = armazemNumbers[0];

        for (int i = 1; i < armazemNumbers.length; i++)
        {
            if(armazemNumbers[i] > Maior) {
                Maior = armazemNumbers[i];

            }

            if (armazemNumbers[i] < Menor){
                Menor = armazemNumbers[i];

            }


        }

        System.out.println("O menor numero é: "+ Maior);
        System.out.println("O menor numero é: "+ Menor);
    }
}
