package dev.oviedo.daos;

import java.util.List;

public interface GenericDAO<T> {

    T getById(int staffID);

    List<T> getAll();

}
