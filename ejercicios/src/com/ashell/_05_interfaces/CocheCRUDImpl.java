package com.ashell._05_interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void saveCoche() {
        System.out.println("Supuestamente se guardó un Coche ;)");
    }

    @Override
    public List<String> findAllCoches() {
        System.out.println("Supuestamente muestro todos los coches ;)");
        return null;
    }

    @Override
    public void deleteCoche() {
        System.out.println("Borraste algo sin where :c");
    }
}
