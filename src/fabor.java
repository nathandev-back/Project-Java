import java.util.Scanner;

public class fabor {
    public static void Fabonacci ()
    {
        Scanner scanner = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        int limit = scanner.nextInt();
        while(f2 < limit) {
            int fn =f1 + f2;
            if (fn  > limit)
                break;
            System.out.print(fn);
            f1 = fn;
            f2 = fn;
        }
    }
}
