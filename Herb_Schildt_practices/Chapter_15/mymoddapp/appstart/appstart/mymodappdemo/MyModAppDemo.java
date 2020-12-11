package Chapter_15.mymoddapp.appstart.appstart.mymodappdemo;

import Chapter_15.mymoddapp.appsrc.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {

        if(SimpleMathFuncs.isFactor(2, 10)) {
            System.out.println("2 is a factor of 10");
        }

        System.out.println("Smallest factor common to both 35 and 105 is " + SimpleMathFuncs.lcf(35, 105));

        System.out.println("Largest facotor commont to both 35 and 105 is " + SimpleMathFuncs.gcf(35, 105));
    }


}
