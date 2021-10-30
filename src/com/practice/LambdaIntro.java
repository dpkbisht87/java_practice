package com.practice;

interface  Drawable{
//    public void draw();
//    public void say(String name);
//    public String sayAgain(String name);
int add(int a,int b);
}

public class LambdaIntro {

    public static void main(String[] args) {
        int width=10;
        System.out.println("Hello World");

       /* Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);

            }
        };*/

/*        Drawable d = (name) -> {
            System.out.println("Drawing " + name);
            return "I work in " + name;
        };*/

        Drawable d = Integer::sum;
        System.out.println(d.add(1, 3));

//        d.say("Oracle");
//        System.out.println(d.sayAgain("Oracle"));
//        d.draw(20);

    }
}
