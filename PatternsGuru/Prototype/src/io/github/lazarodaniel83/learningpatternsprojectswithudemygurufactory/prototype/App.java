
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.prototype;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args){
       (new App()).run() ;
        
    }
    
    public void run(){
    
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);
        
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);
        
        cloneAndCompare(shapes, shapesCopy);
    }
    
    public void run1(){
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if(shape1 != shape2 && !shape1.equals(shape2)){
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else{
            System.out.println("Big green circle == Medium Blue rectangle (booo!");
        }

        if(shape2 != shape3){
            System.out.println("Medium blue rectangle are two different objects (yay!");
            if(shape2.equals(shape3)){
                System.out.println("And they are identical (yay!)");
            }else{
                System.out.println("But they are not identical (booo!)");
            }
        }else{
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
    
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for (Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i= 0; i < shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes are diferent object(yay!)");
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i + ": And they are identical(yay!)");
                }
                else{
                    System.out.println(i + ": But they  not are identical(booo!)");
                }
            }else{
                System.out.println(i + ": shape object are the same(boo!)");
            }
        }
    }
    
}
