public class Main {
    public static void main(String[] args) {
        Printable printable[] ={createObject("iphone7"),createObject("Iphone6"),
                createObject("iphine5")};
        for (Printable print1:printable) {
            print1.print();
        }

    }
    public static Printable createObject(String classNAme){
        switch (classNAme){
            case "iphone7":
                Iphone_7 iphone_7=new Iphone_7(33,"BM43");
                return iphone_7;
            case "Iphone6":
                Iphone_6 iphone_6 = new Iphone_6(58,"BN68");
                return iphone_6;
            case "iphine5":
                Iphone_5 iphone_5a = new Iphone_5(78,"BN87",87 );
                return iphone_5a;
        }
        return  null;
    }
}