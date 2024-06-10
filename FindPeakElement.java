import java.util.*;
class FindPeakElement {
    static ArrayList<Integer> findPeak(int[] arr, int n)
    {
        ArrayList<Integer> arrayOfElements = new ArrayList<Integer>();
       if (n == 1)
            arrayOfElements.add(0);
       else{
        if (arr[0] >= arr[1])
            arrayOfElements.add(0);
        if (arr[n - 1] >= arr[n - 2])
            arrayOfElements.add(n - 1);
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                    arrayOfElements.add(i);
            }
        }
        return arrayOfElements;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,5,20,-45,-5};
        int n = arr.length;
        System.out.print("Index of a peak point is " + findPeak(arr, n));
    }
}

