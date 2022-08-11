package Pen.models;
import Pen.interfaces.RefilStrategy;
import Pen.interfaces.Writeable;

public abstract class Pen implements Writeable{

    Body body;
    Nib nib;
    Ink ink;
    RefilStrategy refilStrategy;
    
    public Pen(Body body, Nib nib, Ink ink, RefilStrategy refilStrategy){
        this.body = body;
        this.nib = nib;
        this.ink = ink;
        this.refilStrategy = refilStrategy;

    }

    
    public void refil(){
        this.refilStrategy.refil();
    }


}