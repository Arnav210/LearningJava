import java.util.Scanner;

public class Testing {

    public static void main(String[] args)
    {   
        int n = 3;
        int i;
        for (i = 1; i <= n-1; i++) {
            for (int j = 3; j >= i + 1; j--) {
                System.out.println(j);
            }
        }
    }
}
