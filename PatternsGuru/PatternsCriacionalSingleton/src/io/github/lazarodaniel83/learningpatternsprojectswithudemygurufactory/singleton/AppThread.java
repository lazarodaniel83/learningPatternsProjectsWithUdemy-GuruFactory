
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.singleton;


public class AppThread {

    public static void main(String[] args){
        (new AppThread()).runMThread() ;
    }
    
    public void runMThread(){
        System.out.println("If you see the name value, then singleton was"
                + "reused (yay!)"+"\n"+"If you see different values, then "
                + "2 singletons where created (booo!)" + "\n\n"+"RESULT:"+"\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();    
    
    
        static class ThreadFoo implements Runnable{
            @Override
            public void run(){
                Singleton singleton = Singleton.getInstance("FOO");
                System.out.println(singleton.value);
            }
        }

        static class ThreadBar implements Runnable{
            @Override
            public void run(){
                Singleton singleton = Singleton.getInstance("BAR");
                System.out.println(singleton.value);
            }
        }
    }    
}
