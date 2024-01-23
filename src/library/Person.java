package library;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

	private static int count;
	private final int id = ++count;
	private String name;

	private List<Item> checkedOut = new ArrayList<>();

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

	public boolean checkOut(Item item) {
		return this.checkedOut.add(item);
	}

	public boolean returnItem(Item item) {
		return this.checkedOut.remove(item);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", checkedOut=" + checkedOut + "]";
	}

	@Override
	public int compareTo(Person o) {
		return id - o.id;
	}
}
