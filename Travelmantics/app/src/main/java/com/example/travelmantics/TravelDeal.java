package com.example.travelmantics;

public class TravelDeal {

    private String id;
    private String Title;
    private String Description;
    private String price;
    private String imageUrl;

    public TravelDeal(){


    }

    public TravelDeal(String title, String description, String price, String imageUrl) {
        this.Title = title;
        this.Description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
