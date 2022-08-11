package Pen.Strategy;

import Pen.interfaces.RefilStrategy;

public class InkRefilStrategy implements RefilStrategy{
    @Override
    public void refil(){
        System.out.println("Ink Replace Strategy");
    }
    
}
