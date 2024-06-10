import java.util.Stack;
public class SortStackUsingTempStack {
    public Stack<Integer> sortStack(Stack<Integer> st,int n){
        Stack<Integer> sortedStack = new Stack<>();
        int temp= st.pop();
        for(int i=1;i<n-1;i++){
            if (temp> st.get(i)){
                temp = st.get(i);
                sortedStack.push(temp);
            }

        }

        return sortedStack;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(3);
        st.add(5);
        st.add(1);
        st.add(4);
        int n= st.size();
        SortStackUsingTempStack sortStackUsingTempStack = new SortStackUsingTempStack();
        sortStackUsingTempStack.sortStack(st,n);
    }
}
