package com.workintech.cylinder;

// Circle sınıfından kalıtım alır (extends)
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        // Üst sınıfın (Circle) constructor'ını çağır
        super(radius);
        // Height 0'dan küçükse 0'a eşitle
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}