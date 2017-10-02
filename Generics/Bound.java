public class Bound <T extends Integer> {
	private T n;

	public Bound(T n){
		this.n = n;
	}

	public boolean isOdd(){
		return n.intValue()%2!=0;
	}
}