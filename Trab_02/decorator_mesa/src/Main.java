public class Main {
    public static void main(String[] args){
        IDecorator decoration = new RodasDecorator(
                new ToalhaDecorator(
                        new RedeDecorator(
                                new Mesa(50, 50, "madeira"), 50
                        ),"vermelha")
                , 40);
        decoration.decorar();


    }
}