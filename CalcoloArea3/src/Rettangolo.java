public class Rettangolo implements Forma{

    private float base;
    private float altezza;

    public Rettangolo(float base, float altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        float area = base * altezza;
        System.out.println("Area rettangolo: " + area);
    }
}
