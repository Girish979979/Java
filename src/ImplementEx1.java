 public class ImplementEx1 implements ExampleInterface{

    public void add(int a,int b){
        System.out.printf("Sum is : %d %n",a+b);
    }

    public void subtract(int a,int b){
        System.out.printf("Subtraction is : %d %n",a-b);
    }

    public void multiply(int a,int b){
        System.out.printf("Multiplication is : %d %n",a*b);
    }
    public static void main(String args[]){
        ImplementEx1 i1 = new ImplementEx1();
        i1.add(2,3);
        i1.multiply(2,3);
        i1.subtract(2,3);
    }

     @Override
     public void add() {

     }

     @Override
     public void multiply() {

     }

     @Override
     public void subtract() {

     }
 }
