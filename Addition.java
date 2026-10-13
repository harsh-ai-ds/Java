/*Addition of two numbers using methods */
public class Addition {
    int add (int a , int b)
    {
        int c = a + b;
        System.out.println("Addition: "+c);
        return c;
    }
    public static void main(String[]args){
        Addition A = new Addition();
        A.add(20,30);
    }
} 