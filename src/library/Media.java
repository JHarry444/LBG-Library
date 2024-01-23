package library;

public class Media extends Item {

	private String type;

	public Media(String name, String type) {
		super(name);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Media [" + super.toString() + ", type=" + type + "]";
	}

}
