package inheritance;

class Television {
    void basicFeatures() {
        System.out.println("Remote control ");
        System.out.println("Disk cable or setupbox supportable");
    }
}

class Crt extends Television {
    void features() {

        System.out.println("Watching View Angle 150");
    }
}

class SmartTv extends Television {
    void features() {
        System.out.println("Internet access");
        System.out.println("OTT platforms can be downloadable");
    }
}

public class TelevisionType {
    public static void main(String[] args) {
        System.out.println("CRT Ttv  ");
        Crt c = new Crt();
        c.basicFeatures();
        c.features();
        System.out.println("Smart tv");
        SmartTv st = new SmartTv();
        st.basicFeatures();
        st.features();
    }
}