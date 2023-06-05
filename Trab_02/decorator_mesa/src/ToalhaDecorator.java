public class ToalhaDecorator extends Decorator {
    private String cor;
    protected IDecorator dc;

    public ToalhaDecorator(IDecorator dc, String cor){
        super(dc);
        this.cor = cor;
    }
    @Override
    public void decorar(){
        super.decorar();
        System.out.println("Toalha "+ cor +" decorando.");
    }
}
