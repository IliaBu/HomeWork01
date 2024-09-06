package ru.gb.architecture.InMemoryModel;

import ru.gb.architecture.ModelElements.*;

import java.util.ArrayList;
import java.util.List;


public class ModelStore implements IModelChangeObserver, IModelChanger {

    private final List<IModelChangeObserver> observers = new ArrayList<>();
    private final List<PoligonalModel> models = new ArrayList<>();
    private final List<Flash> flashes = new ArrayList<>();
    private final List<Scene> scenes = new ArrayList<>();
    private final List<Camera> cameras = new ArrayList<>();

    public Scene getScene(int scene) {
        return scenes.get(scene);
    }

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangeObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer1");
    }
}
