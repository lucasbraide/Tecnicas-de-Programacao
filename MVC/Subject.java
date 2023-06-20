package MVC;

abstract class Subject{
    Observer[] observers = new Observer[10];
    int count = 0;

    void attach (Observer o){
        observers[count++] = o;
    }

    void deAttach (Observer o ){
        // Implementar
    }

    void notifyObservers(){

        for (int i = 0; i< count; i++){
            observers[i].update();
        }
    }
}

