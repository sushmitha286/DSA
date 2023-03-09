/*import java.util.Scanner;
class Lcm{
    static int lcmofnum(int a ,int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a==0&& res%b == 0){
                break;
            }
            res++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcmofnum(a ,b));
    }
}/*
/*
input: 2 5
output : 10
lcm(a,b) = a*b/gcd(a,b)
*/
import java.util.Scanner;
class Lcm{
    static int lcmofnum(int a ,int b){
       return a*b/gcd(a,b);
    }
    static int gcd(int a,int b){
        while(a != 0&& b != 0){
            if(a>b){
            a= a-b;
        }
        else{
            b = b - a;
        }
        }
        if(a!=0){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcmofnum(a ,b));
    }
}