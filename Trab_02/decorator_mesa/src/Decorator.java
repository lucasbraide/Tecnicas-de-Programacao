public abstract class Decorator implements IDecorator{
    protected IDecorator dc;
    public Decorator(IDecorator dc){
        this.dc = dc;
    }

    public void decorar(){
        dc.decorar();
    }
}