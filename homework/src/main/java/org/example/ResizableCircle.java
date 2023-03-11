package org.example;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent){
        super.radius = ((percent / 100) * super.radius) + super.radius;
    }
}
