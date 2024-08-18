public class linearsrch {
    public static void main(String[] args) {
        int  arr[] = {12,3,4,23,67,9,634};
        int n= arr.length;
        int x = 9;
        int flag = 0;
        for(int i = 0 ; i<n;i++)
        {
            if(x== arr[i])
            {
                flag = i;
            }
            else{
                continue;
            }
        }
        if(flag== 0){
            System.out.println("element not found in the array");
        }
        else{
            System.out.println("Element found at the index ::" + flag);
        }
    }
}
