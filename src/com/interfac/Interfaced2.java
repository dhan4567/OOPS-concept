/*constructor not allow in interface,all methods are abstract and abstract methods does not have method body,if you wanna implement methods inside the interface then make them default and private methods,
 but private method does not have access,default method can implement in the interface without overriding inside the child classes, if you don't want to break the functionality of methods,but you wanna add new abstract method in the interface ,then make it default and write method body also,then it capable to access same default method from the derived/child class also */

package com.interfac;

interface Camera {
    void takeSnapshot();

    void recordingVideo();

    private void displayName(){
        System.out.println("samsung camera");

    }
    default void playCamera(){
        displayName();
        System.out.println("hi omkar");

    }

}

class SmartPhone implements Camera {
    public void takeSnapshot() {
        System.out.println("hello");

    }

    public void recordingVideo() {
        System.out.println("heyy");

    }
}

public class Interfaced2 {
    public static void main(String[] args) {
        SmartPhone sm =new SmartPhone();
        sm.takeSnapshot();
        sm.recordingVideo();
        sm.playCamera();

      //  sm.displayName(); //has private access

    }
}
