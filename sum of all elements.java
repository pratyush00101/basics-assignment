public class assi3 {
    static int sumarr(int array[] , int size)
    {
        int res = 0;
        for(int i = 0 ; i<size;i++)
        {
             res += array[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {12,34,2,3,1,34,12,};
        int n = arr.length;
        System.out.println( sumarr(arr , n));
    }
}
