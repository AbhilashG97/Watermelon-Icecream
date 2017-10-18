public class MyNode extends Node {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.data");
        super.setData(data);
    }

    /*synthetic*/
    public void setData(/*synthetic*/ Object data) {
        this.setData((Integer) data);
    }
}
