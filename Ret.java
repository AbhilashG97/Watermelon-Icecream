class Mat {
    int marks = 90;

    void text() {
        System.out.println("My marks for the end semester exams are :  " + marks);
    }
}

class Jack extends Mat {
    int marks = 200;

    void text() {
        super.text();
        System.out.println("Jack's marks are : " + marks);
    }
}

class Ret extends Jack {
    int marks = 105;

    public static void main(String[] args) {
        Jack r = new Ret();
        r.text();
        System.out.println("My marks for the end semester are : " + r.marks);
    }

    void text() {
        super.text();
        System.out.println("My marks for the end semester are : " + marks);
    }
}