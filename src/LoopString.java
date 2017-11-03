public class LoopString {
    public static void main(String args[]){
        int [] numbers = {10,20,30,40};
        for (int x : numbers){
            System.out.print(x);
            System.out.print(",");
        }

        String [] names = {"A","B"};
        for(String y : names){
            System.out.print(y);
            System.out.print(",");
        }
    }
}
