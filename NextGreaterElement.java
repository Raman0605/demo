import java.util.Stack;
public class NextGreaterElement {
    public void stackDemo(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n-1;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j])
                    st.push(arr[j]);
                break;
            }
        }
        System.out.println(st);
    }


    public static void main(String[] args) {
        int [] arr = {4,5,2,25};
        int n = arr.length;
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        nextGreaterElement.stackDemo(arr,n);

    }
}