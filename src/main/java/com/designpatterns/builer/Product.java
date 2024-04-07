package com.designpatterns.builer;

public class Product {

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;

    public Product(ProductBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public static class ProductBuilder{
        private Integer id;
        private String name;
        private String description;
        private Double price;
        private Integer stock;

        public Product build() {
            return new Product(this);
        }

        public ProductBuilder(String name, Double price){
            this.name=name;
            this.price=price;
        }

        public ProductBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setStock(Integer stock) {
            this.stock = stock;
            return this;
        }
    }

}
