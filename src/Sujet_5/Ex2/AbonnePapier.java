package Sujet_5.Ex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;

public class AbonnePapier extends PropertyChangeEvent {

   // NumeroJournal nj=(NumeroJournal)
                //event.getNewValue();


    /**
     * Constructs a new {@code PropertyChangeEvent}.
     *
     * @param source       the bean that fired the event
     * @param propertyName the programmatic name of the property that was changed
     * @param oldValue     the old value of the property
     * @param newValue     the new value of the property
     * @throws IllegalArgumentException if {@code source} is {@code null}
     */
    public AbonnePapier(Object source, String propertyName, Object oldValue, Object newValue) {
        super(source, propertyName, oldValue, newValue);
    }
}
