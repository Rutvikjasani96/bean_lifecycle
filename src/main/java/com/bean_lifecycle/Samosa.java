package com.bean_lifecycle;

public class Samosa {
    private int price;

//    Getters
    public int getPrice() {
        return price;
    }

//    Setters
    public void setPrice(int price) {
        System.out.println("Price Setting...");
        this.price = price;
    }

//    Constructor
    public Samosa(int price) {
        this.price = price;
    }

    public Samosa() {
    }
    //    toString


    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    //    init Method
    public void init(){
        System.out.println("Init Called...");
    }

//    Destroy Method
    public void destroy(){
        System.out.println("Destroy Called...");
    }
}
