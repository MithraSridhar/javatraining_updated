package day6;

public interface NestedInterface {

    void driver();

    interface Car{
        void accelarate();
    }
}

class Test implements NestedInterface.Car{

    @Override
    public void accelarate() {

    }
}
