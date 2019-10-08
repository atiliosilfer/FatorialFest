import java.util.Scanner;

public class Fat{
    public static void main(String[] args) {
        System.out.println("Insira um numero para calcular o fatorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fatorial de "+n+" = "+fatorial(n));
        sc.close();
    }
    public static int fatorial (int n){
        int resp;
        if(n==0||n==1){
            resp = 1;
        }
        else{
            resp = n*fatorial(n-1);
        }
        return resp;
    }
}