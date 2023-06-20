package MVC;

public class InboxModel extends Subject{
    String sender;
    String receiver;
    String message;

    void setSender(String sender){
        this.sender = sender;
    }

    String getSender(){
        return this.sender;
    }

    void setReceiver(String receiver){
        this.receiver = receiver;
    }

    String getReceiver(){
        return this.receiver;
    }

    void setMessage(String message){
        this.message = message;
        if (this.receiver.isEmpty() || this.sender.isEmpty()){
            System.out.println("Erro");
        }
        this.notifyObservers();
    }

    String getMessage(){
        return this.message;
    }
}
