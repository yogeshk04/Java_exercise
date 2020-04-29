
public final class ImmutableClassExample implements Cloneable {

	final String pan;

	public ImmutableClassExample(String pan) {
		this.pan = pan;
	}
	
	public String getPan() {
		return pan;
	}

	@Override
	public String toString() {
		return "ImmutableClassExample [pan=" + pan + "]";
	}
	
	

}
