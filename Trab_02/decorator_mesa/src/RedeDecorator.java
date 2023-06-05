public class RedeDecorator extends Decorator {
    private final int altura;
    protected IDecorator dc;

    public RedeDecorator(IDecorator dc, int altura){
        super(dc);
        this.altura = altura;
    }

    public void decorar(){
        super.decorar();
        System.out.println("Rede de Ping Pong com altura "+this.altura+" decorando." );
    }
}
