package structural.decorator.java8;

import java.awt.*;

public class SampleDecorator {

    public static void printSnap(Camera camera){
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }

    public static void main(String[] args) {
        printSnap(new Camera());
        printSnap(new Camera(Color::brighter));
        printSnap(new Camera(Color::darker));
        printSnap(new Camera(Color::brighter, Color::darker));
    }
}
