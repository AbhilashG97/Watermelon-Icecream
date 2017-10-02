class NaturalNumber{
	private int i;

	public NaturalNumber(int i){
		this.i = i;
	}
}

class EvenNumber extends NaturalNumber{
	public EvenNumber(int i){
		super(i);
	}
}
