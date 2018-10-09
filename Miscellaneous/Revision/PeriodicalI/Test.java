import java.util.Scanner;

class Test {

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Stack st = new Stack(sc.nextInt());
            st.pushAll();
            st.displayAll();
            st.pop();
            st.displayAll();
            System.out.println("-----------\n"+st.peek());
        } 
    }
}
