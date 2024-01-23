package library;

import java.time.LocalDate;

public class Newspaper extends Item {

	private LocalDate published;

	public Newspaper(String name, LocalDate published) {
		super(name);
		this.published = published;
	}

	public LocalDate getPublished() {
		return published;
	}

	public void setPublished(LocalDate published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Newspaper [" + super.toString() + ", published=" + published + "]";
	}

}
