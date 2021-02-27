package net.dm.service;

/**
 * @author Thinlk
 * @create 2021-02-27 3:13 PM
 **/
public class Status {
    private final String NAME;

    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");


    private Status(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
