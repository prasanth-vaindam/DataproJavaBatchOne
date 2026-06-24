package D016;

class Converter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        System.out.println(Converter.kmToMiles(10));
    }
}