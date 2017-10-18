public class Test {
    public static void main(String[] args) {
        // MyNestedClass nested = new MyNestedClass();
        // MyNestedClass.InnerClass inner = nested.new InnerClass();
        // inner.printText();
        // String name = "Ram";
        // name = "Raju";
        // System.out.println(name);
        AnonymousClass ac = new AnonymousClass("Jack") {

            public void printName() {
                super.printName();
                System.out.println("Sub Class");
                super.name = "Susano";
                System.out.println(name);
            }
        };
        ac.printName();
        AnonymousInterface at = new AnonymousInterface() {
            public void printName(String name) {
                System.out.println(name);
            }
        };
        at.printName("Jack");
    }
}