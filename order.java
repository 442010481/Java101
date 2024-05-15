package Comapny_;

class Order {

    public int id;
    public String title;
    public String model;
    public int weight;
    public double price;
    public String status;

    public Order(int id, String title, String model, int weight, double price, String status) {
        this.id = id;
        this.title = title;
        this.model = model;
        this.weight = weight;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void getInfoOrder() {
        System.out.println("id: " + id);
        System.out.println("name: " + title);
        System.out.println("address " + model);
        System.out.println("mobile " + weight);
        System.out.println("Price " + price);
        System.out.println("email: " + status);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", title=" + title + ", model=" + model + ", weight=" + weight + ", price=" + price + ", status=" + status + '}';
    }

}
