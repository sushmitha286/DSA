import java.util.Scanner;
class sieveprime{
    static void sieveintprimes(int n){
        boolean[] prime = new boolean[n+1]; //n+1 size 
        for(int i =2;i<=n;i++){//for(int i =2;i*i<=n;i++) //-2nd optimizatin
            if(prime[i] == false){ // unmarked
                for( int j = i*2;j<=n; j=j+i){//2 incremet so  j = j+i // for(int j = i*i;j<=n;j=j+i) -1st optimization
                       prime[j] = true;
                }
            }

        }
        for(int i =2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         sieveintprimes(n);
       
    }
}

