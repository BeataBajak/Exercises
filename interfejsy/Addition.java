package pl.samouczekprogramisty.interfejsy;

public class Addition implements Computation{
    @Override
    public double compute (double a, double b){
        return a+b;
    }
}
