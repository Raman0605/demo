import java.util.*;
public class MaximumElement {
     static ArrayList<Integer> findMaxElement(int[] arr, int n){
         ArrayList<Integer> arryOfElemet = new ArrayList<>();
         if (n==1)
             arryOfElemet.add(0);
         else {
             if (arr[0] >= arr[1])
                 arryOfElemet.add(0);
             if (arr[n - 1] >= arr[n - 2])
                 arryOfElemet.add(n - 1);
             for (int i = 1; i < n - 1; i++) {
                 if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                     arryOfElemet.add(i);
             }
         }
    return arryOfElemet;
     }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = arr.length;
        System.out.println(findMaxElement(arr,n));
    }
}
//{78,20,98}