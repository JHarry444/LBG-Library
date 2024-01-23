package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> items = new ArrayList<>();
	private List<Person> patrons = new ArrayList<>();

	public List<Item> checkAvailable() {
		List<Item> available = new ArrayList<>();

		for (Item i : items) {
			if (i.isAvailable()) {
				available.add(i);
			}
		}

		return available;
	}

	public void checkOutItem(String name) {
		for (Item item : items) {
			if (item.getName().equals(name)) {
				if (!item.isAvailable()) {
					continue;
				}
				item.setAvailable(false);
				return;
			}
		}
		System.out.println("No available item found with name: " + name);
	}

	public void checkOutItem(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				if (!item.isAvailable()) {
					System.out.println("Item already checked out");
					return;
				}
				item.setAvailable(false);
				return;
			}
		}
		System.out.println("No item found with id: " + id);
	}

	public void checkInItem(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				item.setAvailable(true);
				return;
			}
		}
		System.out.println("No item found with id: " + id);
	}

	public boolean addItem(Item item) {
		return this.items.add(item);
	}

	public boolean removeItem(Item item) {
		return this.items.remove(item);
	}

	public void removeItem(int id) {
		for (Item i : items) {
			if (i.getId() == id) {
				this.items.remove(i);
				return;
			}
		}
		System.out.println("No item found with id: " + id);
	}

	public void updateItem(int id, String name) {
		for (Item i : items) {
			if (i.getId() == id) {
				i.setName(name);
				return;
			}
		}
		System.out.println("No item with id: " + id);
	}

	public boolean registerPerson(Person p) {
		return this.patrons.add(p);
	}

	public void deletePerson(int id) {
		for (Person p : patrons) {
			if (p.getId() == id) {
				this.patrons.remove(p);
				return;
			}
		}
		System.out.println("No person with id: " + id);
	}

	public void updatePerson(int id, String name) {
		for (Person p : patrons) {
			if (p.getId() == id) {
				p.setName(name);
				return;
			}
		}
		System.out.println("No person with id: " + id);
	}

	@Override
	public String toString() {
		return "Library [items=" + items + ", patrons=" + patrons + "]";
	}

}
