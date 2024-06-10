import java.util.Stack;
public class maxElement {
    public void stackDemo(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j])
                    st.push(arr[j]);
            }
            break;
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int n = arr.length;
        maxElement m = new maxElement();
        m.stackDemo(arr, n);
    }
}

