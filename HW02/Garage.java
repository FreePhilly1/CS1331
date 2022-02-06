public class Garage {
    public static void main(String[] args) {
        Car ford1 = new FordGT();
        FordGT ford2 = new FordGT("a", "b", 20, 75, false, 2000, "ken");
        FordGT ford3 = new FordGT();
        ShelbyMustang shelby1 = new ShelbyMustang();
        ford3.setName("asdf");
        System.out.println(ford1.equals(ford3));
        System.out.println(ford1.toString());
        System.out.println(ford2.getName());
        System.out.println("this car name is " + new ShelbyMustang().getName());
        //ford1.upgrade();
        //System.out.println("fl: " + ford1.getFuelLevel());
        //System.out.println("hp: " + ford1.getHorsepower());
        //System.out.println("fl: " + ford2.getFuelLevel());
        //System.out.println("hp: " + ford2.getHorsepower());
        //ford2.upgrade();
        //System.out.println("fl: " + ford2.getFuelLevel());
        //System.out.println("hp: " + ford2.getHorsepower());
    }
}