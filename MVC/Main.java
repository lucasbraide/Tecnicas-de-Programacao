package MVC;

public class Main {
    public static void main(String[] args) {

        InboxModel im = new InboxModel();

        InboxView iv = new InboxView(im);

        InboxController ic = new InboxController(im);

        ic.processInput("mensagem", "enviado","recebido");

        iv.update();

    }
}
