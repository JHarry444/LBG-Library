package library;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Library lib = new Library();

		lib.registerPerson(new Person("Jordan H"));
		lib.registerPerson(new Person("Piers B"));
		lib.registerPerson(new Person("Cameron G"));

		System.out.println(lib);

		lib.deletePerson(2);

		System.out.println(lib);

		lib.updatePerson(1, "JH");

		System.out.println(lib);

		lib.addItem(new Book("Inheritance", true));
		lib.addItem(new Media("Canon", "Camera"));
		lib.addItem(new Newspaper("Times", LocalDate.of(2024, 1, 23)));

		System.out.println(lib);

		lib.removeItem(2);

		System.out.println(lib);

		lib.updateItem(1, "Eragon");

		System.out.println(lib);

		lib.checkOutItem(1, 1);
		lib.checkOutItem(1, 1);

		System.out.println(lib);

		lib.checkInItem(1);

		System.out.println(lib);

	}

}
