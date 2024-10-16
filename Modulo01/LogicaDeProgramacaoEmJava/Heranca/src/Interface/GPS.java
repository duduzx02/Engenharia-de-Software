package Interface;

public interface GPS {
    public void getCoordinates();
}

interface Radio{

    public void getFrequency();

}

class Smathphone implements GPS, Radio{

    @Override
    public void getCoordinates() {

    }

    @Override
    public void getFrequency() {

    }
}
