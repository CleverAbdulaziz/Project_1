package org.example.dao;

import java.util.List;

public interface ApplianceDAO<A> {
    List<A> findAll();
    List<A> findByParameter(String parameter, String value);
}
