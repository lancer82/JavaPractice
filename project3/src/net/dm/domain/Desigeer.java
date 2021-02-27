package net.dm.domain;

import net.dm.service.Status;

/**
 * @author Thinlk
 * @create 2021-02-27 3:38 PM
 **/
public class Desigeer extends Programmer{
    private double bonus; //奖金

    public Desigeer(int id, String name, int age, double salary, int memberId, Status status, Equipment equipment, double bonus) {
        super(id, name, age, salary, memberId, status, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
