package com.example.demo;

public class Shape {
    private String type;
    private int radius;
    private int width;
    private int height;

    public void setType(String type) {
        this.type = type;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getRadius() {
        return radius;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String circleArea() {
        return String.format("Area of a circle with a radius of %s is %s", radius, (Math.PI * Math.pow(radius, 2)));
    }

    public String rectangleArea() {
        return String.format("Area of a %sx%s rectangle is %s",width, height,(height * width));
    }
}
