package net.dm.domain;

import net.dm.service.Status;

import static net.dm.service.Status.FREE;

/**
 * @author Thinlk
 * @create 2021-02-27 3:25 PM
 **/
public class Programmer extends Employee{
    private int memberId ; //开发团队中的ID；
    private Status status = FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
