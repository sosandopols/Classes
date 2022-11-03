package com.company;

class Circle extends Figure{
    private double radius; //рвдиус круга

    public double area() {
        return Math.PI * radius * radius;
    }

    public double length() {
        return Math.PI * 2 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
