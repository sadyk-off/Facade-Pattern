public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();

        int x = 3;
        System.out.println("Cube of " + x + " is " + facade.cubeX(3));
        System.out.println("Cube of " + x + " times 2 is " + facade.cubeXTimes2(3));
        System.out.println(x + " to sixth power times 2 is " + facade.xToSixthPowerTimes2(3));

    }
}
