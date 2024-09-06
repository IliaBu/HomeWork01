package ru.gb.architecture;

import ru.gb.architecture.InMemoryModel.ModelStore;
import ru.gb.architecture.ModelElements.Poligon;
import ru.gb.architecture.ModelElements.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ModelStore store = new ModelStore();
        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);

    }
}