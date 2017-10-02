public class Volcano {

public interface Lava <T, U> {
	
	public void setVar(T t, U u);

	public T getFirstVar();

	public U getSecondVar();

}

Lava<Integer, String> lava = new Lava<Integer, String>(){

	private Integer t;
	private String u;

	public void setVar(Integer t, String u){
		this.t=t;
		this.u=u;
	}

	public Integer getFirstVar(){
		return t;
	}

	public String getSecondVar(){
		return u;
		}
	};
}


