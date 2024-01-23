package library;

public class Book extends Item {

	private boolean hardback;

	public Book(String name, boolean hardback) {
		super(name);
		this.hardback = hardback;
	}

	public boolean isHardback() {
		return hardback;
	}

	public void setHardback(boolean hardback) {
		this.hardback = hardback;
	}

	@Override
	public String toString() {
		return "Book [" + super.toString() + ", hardback=" + hardback + "]";
	}

}
