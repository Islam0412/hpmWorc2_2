
public class Iphone implements Printable {

    private int Camera;
    private String Bata ;

    public int getCamera() {
        return Camera;
    }

    public String getBata() {
        return Bata;
    }

    public Iphone(int camera, String bata) {
        Camera = camera;
        Bata = bata;
    }




    public String info(){
        return +Camera+Bata;
    }

    @Override
    public void print() {

    }
}
