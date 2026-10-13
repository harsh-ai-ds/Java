public class Check {
    void num (int a){
        if(a>0){
            System.out.println("The number is positive :");
        }else if(a<0){
            System.out.println("The number is Negative :");
        }else{
            System.out.println("The number is Zero :");
        }
    }
    public static void main(String[]args){
        Check Ck = new Check();
        Ck.num(10);
    }
}
