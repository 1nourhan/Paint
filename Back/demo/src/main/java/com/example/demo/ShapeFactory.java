package com.example.demo;

import java.util.ArrayList;

public class ShapeFactory {
    String shapeType;
    public static ArrayList<IShape> shapes = new ArrayList<>(100);

    public void setShape(String type) {
        shapeType = type;
    }

    public  static ArrayList createShape(String shapeType, String[] s) {
        System.out.println("type is" + shapeType);
        if(shapeType == null) {
            return null;
        }

        if(shapeType.equalsIgnoreCase("Rectangle")) {
            int length = Integer.parseInt(s[1]);
             int width = Integer.parseInt(s[2]);
             int x = Integer.parseInt(s[3]);
            int y = Integer.parseInt(s[4]);
            int ID = Integer.parseInt(s[5]);
            String color = s[6];
            IShape newShape = new Rectangle(length, width, x, y, ID, color);
            shapes.add(newShape);
            return shapes;
        }
        else if(shapeType.equalsIgnoreCase("Circle")) {
           
             int radius = Integer.parseInt(s[1]);
             int x = Integer.parseInt(s[2]);
            int y = Integer.parseInt(s[3]);
              int ID = Integer.parseInt(s[4]);
            String color = s[5];
            System.out.println("HERE");
            IShape newShape = new Circle(radius, x, y, ID, color);
            shapes.add(newShape);
            System.out.println("AYO");
            return shapes;
        }
        else if(shapeType.equalsIgnoreCase("Ellipse")) {
            int x = Integer.parseInt(s[1]);
             int y = Integer.parseInt(s[2]);
             int rx = Integer.parseInt(s[3]);
            int ry = Integer.parseInt(s[4]);
            int ID = Integer.parseInt(s[5]);
            String color = s[6];
            IShape newShape = new Ellipse(x, y, rx, ry, ID, color);
            shapes.add(newShape);
            return shapes;
        }
        else if(shapeType.equalsIgnoreCase("Triangle")) {
            int x1 = Integer.parseInt(s[1]);
             int y1 = Integer.parseInt(s[2]);
             int x2 = Integer.parseInt(s[3]);
            int y2 = Integer.parseInt(s[4]);
            int x3 = Integer.parseInt(s[5]);
            int y3 = Integer.parseInt(s[6]);
            int ID = Integer.parseInt(s[7]);
            String color = s[8];
            IShape newShape = new Triangle(x1, y1, x2, y2, x3, y3, ID, color);
            shapes.add(newShape);
            return shapes;
        }
        else if(shapeType.equalsIgnoreCase("Square")) {
             int width = Integer.parseInt(s[1]);
             int x = Integer.parseInt(s[2]);
            int y = Integer.parseInt(s[3]);
              int ID = Integer.parseInt(s[4]);
            String color = s[5];
            IShape newShape = new Square(width, x, y, ID, color);
            shapes.add(newShape);
            return shapes;
        }
        else if(shapeType.equalsIgnoreCase("Line")) {
             int x1 = Integer.parseInt(s[1]);
             int y1 = Integer.parseInt(s[2]);
             int x2 = Integer.parseInt(s[3]);
            int y2 = Integer.parseInt(s[4]);
            int ID = Integer.parseInt(s[5]);
            String color = s[6];
            IShape newShape = new Line(x1, y1, x2, y2 ID, color);
            shapes.add(newShape);
            System.out.println("size is " + shapes.size());
            return shapes;
        }
        return null;
    }
}
