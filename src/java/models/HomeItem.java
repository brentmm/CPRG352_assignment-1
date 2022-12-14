package models;

public class HomeItem {

    private String user;
    private String item;
    private String location;
    private String price;

    public HomeItem() {
    }

    public HomeItem(String user, String item, String location, String price) {
        this.user = user;
        this.item = item;
        this.location = location;
        this.price = price;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
