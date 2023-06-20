package MVC;

public class InboxController {

    InboxModel model;

    InboxController(InboxModel model){
        this.model = model;
    }

    void processInput (String message, String sender, String receiver){
        // Na prática, precisamos adicionar regras de negócio (validações, tratamentos, etc) dentro de controller
        this.model.setSender(sender); 
        this.model.setReceiver(receiver);
        this.model.setMessage(message);
    }
}
