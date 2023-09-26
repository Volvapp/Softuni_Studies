package reflectionExercises.barracksWars.core.factories;

import reflectionExercises.barracksWars.interfaces.Unit;
import reflectionExercises.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "reflectionExercises.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {


            Class clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> constructor = clazz.getDeclaredConstructor();
            return constructor.newInstance();

        } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}