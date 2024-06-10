public class MinimumRotationOfString {
    public int minimumRotation(String str){
        int count = 0;
        String temp = str+str;
        int n = temp.length();
        for (int i =1; i<n;i++){
            String substring = temp.substring(i,i+str.length());
            if (str.equals(substring))
                return i;
        }

     return 0;
    }

    public static void main(String[] args) {
        String str = "bcdbcd";
        MinimumRotationOfString minimumRotationOfString = new MinimumRotationOfString();
        System.out.println(minimumRotationOfString.minimumRotation(str));
    }
}
