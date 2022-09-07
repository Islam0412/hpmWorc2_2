public class Iphone_7 extends Iphone {
    private int display;
    private int sensor;

    @Override
    public int getCamera() {
        return super.getCamera();
    }

    public Iphone_7(int camera, String bata, int display, int sensor) {
        super(camera, bata);
        this.display = display;
        this.sensor = sensor;
    }

    public int getDisplay() {
        return display;
    }

    public int getSensor() {
        return sensor;
    }

    public Iphone_7(int camera, String bata) {
        super(camera, bata);
        System.out.println("омалет дисплей " + display + " " + sensor);
    }
}