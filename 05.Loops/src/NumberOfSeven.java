import java.util.Scanner;
public class NumberOfSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=1000; i++) {
            if(i % 10 ==7){
                System.out.println(i);
            }
        }
    }
}
