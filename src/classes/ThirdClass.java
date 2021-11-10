package classes;

public class ThirdClass {

    public int doMoreStuff(FirstClass class1, SecondClass class2, int x) {
        return class1.doSomethingComplicated(x) * class2.doAnotherThing(class1, x);
    }
}
