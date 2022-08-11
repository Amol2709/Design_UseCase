package Pen.models;

import Pen.interfaces.RefilStrategy;

public class GelPen extends Pen {

    public GelPen(Body body, Nib nib, Ink ink, RefilStrategy refilStrategy){
        super(body, nib, ink, refilStrategy);
    }
    @Override
    public void write(){

    }
}
