package Pen.models;

import Pen.interfaces.RefilStrategy;

public class BallPen extends Pen {
    public BallPen(Body body, Nib nib, Ink ink, RefilStrategy refilstrategy){
        super(body, nib, ink, refilstrategy);
    }
    @Override
    public void write(){

    }
}
