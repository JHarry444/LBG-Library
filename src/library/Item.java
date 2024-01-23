package library;

public abstract class Item implements Comparable<Item> {

	private static int count;
	private final int id = ++count;
	private String name;
	private boolean available = true;

	public Item(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", available=" + available;
	}

	@Override
	public int compareTo(Item o) {
		return id - o.id;
	}
}
