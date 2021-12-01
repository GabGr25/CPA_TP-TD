package Sujet_5.Ex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected ArrayList<PropertyChangeListener> listObj;


    public Observable() {
        this.listObj = new ArrayList<PropertyChangeListener>();
    }

    public void addObj(PropertyChangeListener o){
        listObj.add(o);

    }

    //methode qui supprime
    public void notifierobs(PropertyChangeEvent event){
        for(PropertyChangeListener o: listObj)
            o.propertyChange( event);
    }
}
