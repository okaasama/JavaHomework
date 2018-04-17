package lesson8;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PerfectNum {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;

        for (i = 1; i < n; i++) ;

        if (n % i == 0) {

            List<Integer> listOfDivisibles = IntStream.range(1, n)
                    .boxed()
                    .collect(Collectors.toList());
            Optional<Integer> reduced = listOfDivisibles
                    .stream()
                    .reduce((i1, i2) -> i1 + i2);

            /* Got stuck trying to unbox Integer reduced, Math.abs(reduced) doesn't seem to work; reduced.IntValue() won't work either :(

            Simply if (reduced > n) won't work, as they are Integer and int, so I was trying to unbox:

            int a = Math.abs(reduced);
            int a = reduced.intValue();

            */


            if (a > n) {
                System.out.println("Number " + n + "is excessive.");
            } else if (a < n) {
                System.out.println("Number " + n + "is deficient.");
            }

        }
    }
}
