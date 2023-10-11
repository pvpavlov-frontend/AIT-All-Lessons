package homework_59;

public class Product {
    private String title;
    private Double rating;
    private Double price;
    private String category;

    public void priceUp(){
        price += 20.0;
    }


    public Product(String title, Double rating, Double price, String category) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
