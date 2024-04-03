package itpu.uz.service;


import itpu.uz.controller.properity.SearchProperty;
import itpu.uz.entity.Furniture;

import java.util.Collection;

public interface FurnitureService {
    <F extends Furniture<F>> Collection<F> find(SearchProperty<F> property);
}
