package corejava.class_practice_problem;

public class ReverseStringUsingRecursion {
    public static void reverseString(char arr[], int left, int right){
        if(left >= right) return;
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseString( arr,left+1,right-1);

    }
    public static void main(String[] args) { 
       String s = "shivam";
      char arr[] = s.toCharArray();
      reverseString(arr,0,5);
        System.out.println(arr);

    }


}
