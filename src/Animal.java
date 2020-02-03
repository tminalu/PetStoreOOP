public class Animal {
        private String name;
        private String type;
        private String discription;
        private long  price ;
        private String inStock;
        //default contructor
        public Animal(){};
        //overloaded constructor
        public Animal (String name, String type, String discription, long price, String inStock) {
            this.name = name;
            this.type = type;
            this.discription = discription;
            this.price = price;
            this.inStock = inStock;
        }
        //another overloaded constructor
        public Animal(String n){;
            this.name=n;}
        //get pet method
        public void getPet(Animal a) {
            System.out.println(a.name);
            System.out.println(a.type);
            System.out.println(a.discription);
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
}
