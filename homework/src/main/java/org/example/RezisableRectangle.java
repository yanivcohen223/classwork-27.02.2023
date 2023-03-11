package org.example;

public class RezisableRectangle extends Rectangle implements Resizable{

    public RezisableRectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(int percent) {
        super.length = ((percent / 100) * super.length) + super.length;
        super.width = ((percent / 100) * super.width) + super.width;
    }
}
