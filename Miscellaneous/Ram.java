class Bank {
    int getInterest(){
        return 0;
    }
}

class Kim extends Bank {
    int getInterest(){
        return 13;
    }
}

class Federal extends Bank {
    int getInterest(){
        return 14;
    }
}

class SBI extends Bank {
    int getInterest(){
        return 8;
    }
}

class Ram {
    public static void main(String[] args){
        Bank b;
        b=new SBI();  
        System.out.println("SBI Rate of Interest: "+b.getInterest());  
        b=new Federal();
        System.out.println("ICICI Rate of Interest: "+b.getInterest());  
        b=new Kim();
        System.out.println("AXIS Rate of Interest: "+b.getInterest());  
    }
}