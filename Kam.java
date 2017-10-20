class gun {
    void yell(){
        System.out.println("This is a random set of string.");
    }
}


class pistol extends gun {
    void yell(){
        System.out.println("This is a random string about a pistol.");
    }
}

class kam extends pistol {
    public static void main(String []args){
        gun g = new kam();
        g.yell();
    }
}