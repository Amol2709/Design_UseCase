package Pen;

import Pen.models.GelPen;
import Pen.Strategy.InkRefilStrategy;
import Pen.Strategy.ReplaceRefilStartegy;
import Pen.models.Ink;
import Pen.models.Nib;
import Pen.models.Body;
public class Client {
    public static void main(String[] args) {
        System.out.println("Hi");
        GelPen obj1 =  new GelPen(new Body(10), new Nib(1), new Ink("Red"), new InkRefilStrategy());
        GelPen obj2 =  new GelPen(new Body(10), new Nib(1), new Ink("Red"), new ReplaceRefilStartegy());
        obj1.refil();
        obj2.refil();
    }
}
