public class RodasDecorator extends Decorator {
    private final int raio;
    protected IDecorator dc;

    public RodasDecorator(IDecorator dc, int raio){
        super(dc);
        this.raio = raio;
    }
    @Override
    public void decorar(){
        super.decorar();
        System.out.println("Roda de raio " + this.raio + " decorando.");
    }


}