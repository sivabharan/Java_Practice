package JavaSamplePrograms;

public class ReverseString {
    public static void main(String[] args) {

        String origWord ="I love icecream";
        System.out.println("Original Sentence is: "+origWord);

        String printReverse = reverseString(origWord);
        System.out.println("Reversed Sentence is : "+printReverse);
    }

    public static String reverseString(String input){
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        return reverse;
    }


}
