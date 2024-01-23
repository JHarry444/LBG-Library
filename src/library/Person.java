package library;

public class Person implements Comparable<Person> {

	private static int count;
	private final int id = ++count;
	private String name;

	public Person(String name) {
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		return id - o.id;
	}
}
