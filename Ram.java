class bank {
    int getInterest(){
        return 0;
    }
}

class kim extends bank {
    int getInterest(){
        return 13;
    }
}

class federal extends bank {
    int getInterest(){
        return 14;
    }
}

class SBI extends bank {
    int getInterest(){
        return 8;
    }
}

class Ram {
    public static void main(String[] args){
        bank b;  
        b=new SBI();  
        System.out.println("SBI Rate of Interest: "+b.getInterest());  
        b=new federal();  
        System.out.println("ICICI Rate of Interest: "+b.getInterest());  
        b=new kim();  
        System.out.println("AXIS Rate of Interest: "+b.getInterest());  
    }
}
