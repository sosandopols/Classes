package Simple;

public class Simple {
    public static void main(String[] args) {
        Pen pen = new Pen(Colors.Blue);
        System.out.println(pen.getColors());

        Car car = new Car(Colors.Black);
        System.out.println(car.toString());

        Mixer mixer = new Mixer();
        mixer.setValues(5,5);
        System.out.println(mixer.getTemp());
    }

}

