package Arrays;

public class CommonNumber {
    public static void main(String[] args) {
        int arr1[] = {20,67,44,88,92,76,32};
        int arr2[] = {18,42,31,55,88,75,61};

        int common = findCommonNumber(arr1, arr2);

        if(common!=-1){
            System.out.println("The common number is:" +common);
        }else{
            System.out.println("There is no common number");
        }
    }



    public static int findCommonNumber(int arr1[], int arr2[]){
        for(int e1: arr1){
            for(int e2: arr2){
                if(e1==e2){
                    return e1;
                }
            }
        }
        return -1;
    }
}
