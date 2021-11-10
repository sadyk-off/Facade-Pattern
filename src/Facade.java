import classes.FirstClass;
import classes.SecondClass;
import classes.ThirdClass;

public class Facade {

    public int cubeX(int x) {
        FirstClass class1 = new FirstClass();
        return class1.doSomethingComplicated(x);
    }

    public int cubeXTimes2(int x) {
        FirstClass class1 = new FirstClass();
        SecondClass class2 = new SecondClass();
        return class2.doAnotherThing(class1, x);
    }

    public int xToSixthPowerTimes2(int x) {
        FirstClass class1 = new FirstClass();
        SecondClass class2 = new SecondClass();
        ThirdClass class3 = new ThirdClass();
        return class3.doMoreStuff(class1, class2, x);
    }
}
