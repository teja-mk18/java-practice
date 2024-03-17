import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        } else if (age == 18){
            System.out.println("18");
        } else {
            System.out.println("Not Adult");
        }
    }
}