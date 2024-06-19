public class Triangolo implements Forma{

    private float base;
    private float altezza;

    public Triangolo(float base, float altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        float area = (base * altezza)/2;
        System.out.println("Area triangolo: " + area);
    }
}