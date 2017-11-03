public class ConditionalOperator {
    public static void main(String args[]){
    int a = 10,b=20;
    b = (a==10) ? 100 : 200;
    System.out.println("b for true : "+b);
    b = (a==20) ? 100:200;
    System.out.println("b for false : "+b);
    }

}
