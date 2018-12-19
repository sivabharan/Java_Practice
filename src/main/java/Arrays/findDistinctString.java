package Arrays;

public class findDistinctString {
    public static void printDistinctElements(String[] arr){

        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String a[]){

        String[] values = {"siva","john","siva"};
        findDistinctString.printDistinctElements(values);
    }
}


