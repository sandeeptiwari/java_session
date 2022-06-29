package assignments;

public class Movies {
	
	public Movies(String name1, double rating1 , Category categoryNew) {
		this.setName(name1);
		this.setRating(rating1);
		this.setCategory(categoryNew);
		
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Movies [category=" + category + "]";
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	private double rating;
	private Category category;

}
