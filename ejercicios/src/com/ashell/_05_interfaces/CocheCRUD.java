package com.ashell._05_interfaces;

import java.util.List;

public interface CocheCRUD {
    void saveCoche();
    List<String> findAllCoches();
    void deleteCoche();

}
