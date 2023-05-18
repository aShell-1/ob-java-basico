package com.ashell._05_interfaces;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {
        cocheCRUD.saveCoche();
        cocheCRUD.findAllCoches();
        cocheCRUD.deleteCoche();
    }
}
