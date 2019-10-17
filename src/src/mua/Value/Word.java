package src.mua.Value;

public class Word implements Value {

	private String word = "";

	public Word(String word) {
		this.word = word;
	}

	@Override
	public boolean canBeName() {
		return this.word.matches("^[a-zA-z][a-z_A-z0-9]*$");
	}

	@Override
	public Value toNumber() {
		Value ret = new None();
		if (ValueFactory.isNumber(this.getWord())) {
			ret = new Number(Double.parseDouble(this.getWord()));
		}
		return ret;
	}

	@Override
	public Value toBool() {
		Value ret = new None();
		if ((this.getWord().equals("true") || this.getWord().equals("false"))) {
			ret = new Bool(Boolean.parseBoolean(this.getWord()));
		}
		return ret;
	}

	@Override
	public Value toWord() {
		return this;
	}

	@Override
	public double getNumber() {
		return 0;
	}

	@Override
	public boolean getBool() {
		return false;
	}

	@Override
	public String getWord() {
		return word;
	}

	@Override
	public void print() {
		System.out.print(this.getWord());
	}
}