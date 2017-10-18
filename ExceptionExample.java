class Example {

    public void jam(String jamName) {
        // if(jamName == null){
        // 	throw new IOException("No name entered");
        // }else {

        // }
        System.out.println(jamName);
    }

    public void pickle(String pickleName) throws IOException {
        if (pickleName == null) {
            throw new IOException("No input");
        } else {
            System.out.println(pickleName);
        }
    }
}

class ExceptionExample extends Example {

    public static void main(String[] args) throws Exception {
        ExceptionExample ee = new ExceptionExample();
        ee.jam("Kissan ");
    }

    @Override
    public void jam(String jamName) throws ArithmeticException {
        if ("Kissan".equals(jamName)) {
            throw new ArithmeticException("Invalid input");
        } else {
            System.out.println("Yay !");
        }

    }
}