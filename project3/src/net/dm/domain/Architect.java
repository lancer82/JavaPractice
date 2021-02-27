package net.dm.domain;


import net.dm.service.Status;

/**
 * @author Thinlk
 * @create 2021-02-27 3:41 PM
 **/
public class Architect extends Desigeer {
    private int stock;

    public Architect(int id, String name, int age, double salary, int memberId, Status status, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, memberId, status, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
