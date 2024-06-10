public class MinRotation {
    public int minRotate(String str){
        String temp = str+str;//(bcdbcdbcdbcd)
        int n =temp.length();
        for (int i =1 ;i<n;i++){
            String subString = temp.substring(i,i+str.length());//substring 1st index =1, last index = 4
            if(str.equals(subString))
                return i;
        }
     return 0;
    }

    public static void main(String[] args) {
        String str = "aaa";   
        MinRotation minRotation = new MinRotation();
        System.out.println(minRotation.minRotate(str));

    }
}
