class jam {
    int marks = 45;
}

class july extends jam {
    int marks = 100;

    public static void main(String[] args){
        jam j = new july();
        System.out.println("This is my marks : "+j.marks);
    }
}