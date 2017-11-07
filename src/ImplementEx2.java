public class ImplementEx2 implements ExtendInterface {

    public void divide(int a,int b){
        System.out.printf("Division is : %d%n",a/b);
    }

    public void add(int a,int b){
        System.out.printf("Sum is : %d",a+b);
    }

    public static void main(String args[]){
        ImplementEx2 i2 = new ImplementEx2();
        i2.divide(6,3);
        i2.add(6,3);
    }

    @Override
    public void divide() {

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
