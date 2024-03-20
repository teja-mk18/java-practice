//question1
//import java.util.*;
//
//public class Main {
//    public static void printname(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String name = sc.next();
//
//        printname(name);
//    }
//}

//question2
//import java.util.*;
//public class Main{
//    public static int add(int num1,int num2){
//        int sum = num1 + num2;
//        return sum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//       int sum = add(num1,num2);
//       System.out.println(sum);
//
//    }
//}

//question 3(factorial)
import java.util.*;
public class Main{
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }

        System.out.println(fact);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);

    }
        }