 class calc{
    int result;
    
    
    int add(int x)
    {
       int a = x;
       result = a+a;
       return result;
    }

    int add(int x , int y)
    {
        result = x+y;
        return result;

    }

    int add(int x , int y , int z)
    {
        result = x+y+z;
        return result;
    }

}

public class assi1{
    public static void main(String[] args) {

        calc c1 = new calc();
        int a=   c1.add(12);
        System.out.println(a);
       a= c1.add(12,23);
        System.out.println(a);
       a= c1.add(12,34,54);
        System.out.println(a);
        
    }
}