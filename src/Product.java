public class Product {
    private int id;
    private String name;
    private int price;
    private String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        return "Товар[артикул=" + this.id + ", название=" + this.name + ", цена=" + this.price + ", категория=" + this.category + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || this.getClass() != obj.getClass()) {
            return false;
        }

        // Сравниваем, приведение к классу Product не надо, так как выше отсеяли все другие,
        // но приходится делать чтобы не было замечаний
        Product p = (Product) obj;
        return (this.id == p.getId()) && this.category.equals(p.getCategory()) ;

    }
}
