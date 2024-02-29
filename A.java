package com.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 *
 * @author miguel_rico
 */
public class A {
    
    private String[] splitValues = null;
    private Line l1 = null;
    private Line l2 = null;

    public A(String values) {
        this.splitValues = values.split(" ");
        this.createLines();
        this.areParallelLines();
        this.getIntersection();
    }
    
    public class Line {
    
        public Line (Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
        
        private Point p1;
        private Point p2;
        
        public float getSlope () {
            return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
        }
        
    }
    
    public class Point {
        
        public Point (float x, float y) {
            this.x = x;
            this.y = y;
        }
        
        private float x, y;

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
        
    }
    
    public void createLines () {
        for(int i = 0; i < this.splitValues.length; i=i+4) {
            switch (i) {
                case 0:
                    this.l1 = new Line(new Point(Float.valueOf(splitValues[i]), Float.valueOf(splitValues[i+2])), new Point(Float.valueOf(splitValues[i+2]), Float.valueOf(splitValues[i+3])));
                    break;
                case 4:
                    this.l2 = new Line(new Point(Float.valueOf(splitValues[i]), Float.valueOf(splitValues[i+2])), new Point(Float.valueOf(splitValues[i+2]), Float.valueOf(splitValues[i+3])));
                default:
            };
        }
    }

    public void areParallelLines () {
        if(Objects.equals(Math.abs(l1.getSlope()), Math.abs(l2.getSlope()))) { System.out.println("PARALELAS"); }
    }
    
    public void getIntersection () {
        
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String values = reader.readLine();
        
        new A(values);
        
    }
}
