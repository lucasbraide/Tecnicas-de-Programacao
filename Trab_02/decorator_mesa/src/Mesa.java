public class Mesa implements IDecorator{
    public int largura;
    public int comprimento;
    public String material;
    public Mesa(int largura, int comprimento, String material){
        this.largura = largura;
        this.comprimento = comprimento;
        this.material = material;
        System.out.println("Mesa de "+this.material+ " criada de comprimento: "+this.comprimento+" e largura: "+this.largura+".");
    }

    public void decorar(){
        System.out.println("Decorações:");
    }
}