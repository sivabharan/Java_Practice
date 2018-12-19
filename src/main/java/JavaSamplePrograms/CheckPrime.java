package JavaSamplePrograms;

public class CheckPrime {
public boolean isPrime(int prime) {
        for(int i =2;i<=prime/2;i++){
            if(i%2==0){
                return false;
            }
        }
    return true;
    }

 public static void main(String a[]) {
    CheckPrime cp = new CheckPrime();
    System.out.println(cp.isPrime(2));
 }
}
