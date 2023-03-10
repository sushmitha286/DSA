// import java.util.Scanner;
// class divisor{
// static void divide(int n){
//     for(int i=1;i<=n;i++)
//     {
//         if(n%i==0){
//             System.out.println(i);

//         }
// }
// }

//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     divide(n);
//     }
// }

import java.util.Scanner;   //most efficient way
class divisor{
static void divide(int n){
int i = 0;
    for(i=1;i*i<=n;i++)
    {
        if(n%i==0){
            System.out.println(i);
        }
 }
   for( ;i>=1;i--)
    {
        if(n%i==0){
            System.out.println(n/i);
        }

}
}

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    divide(n);
    }
}
