public class Local {
    int Age;

    public void pupAge(){
         Age = 10;
        Age = Age + 20;
        System.out.println("Age is :"+Age);
    }

    public static void main(String args[]){
        Local pup = new Local();
        pup.pupAge();
    }
}

