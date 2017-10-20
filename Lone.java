class test {
    final void display(){
        System.out.println("This is a test method.");
    }
}

class lone extends test {
    public static void main(String[] args){
        lone t = new lone();
        t.display();
    }
}