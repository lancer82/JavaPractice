package net.dm.domain;

/**
 * @author Thinlk
 * @create 2021-02-27 2:43 PM
 **/
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double prive) {
        this.model = model;
        this.price = prive;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrive() {
        return price;
    }

    public void setPrive(double prive) {
        this.price = prive;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

}
