package Arrays;

public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,4,5};
        int temp=0;
        for (int i =0;i<=arr.length;i++){
            if(i>temp){
                temp = i;
            }
        }
        System.out.println(temp);
    }
}
