public class SearchElement {
    static int searchElementInArray(int arr[], int item){
    for(int i=0;i<arr.length;i++) {
        if(item==arr[i]) {
            return i;
        }
    }
        return 0;
    }
    public static void main(String args[]){
        int [] arr = {1,2,3,5,2};
        int item = 2;
        System.out.println(searchElementInArray(arr,item));
    }
}
