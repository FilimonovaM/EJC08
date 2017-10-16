package com.epam.trifficLightsAddon;

/**
 * Created by Admin on 016 16.10.17.
 */
public class MultiThreadTrafficLightsWithoutEnum extends Throwable{
    int timecode[] = {2,3,5};

    public static void main(String[] args) throws InterruptedException {
        MultiThreadTrafficLightsWithoutEnum multiThreadTrafficLightsWithoutEnum = new MultiThreadTrafficLightsWithoutEnum();
        multiThreadTrafficLightsWithoutEnum.runTheTrafficLights();
    }
    private void runTheTrafficLights() throws InterruptedException {
        for(int i = 0;;i++){
            switch (i){
                case 0: System.out.println("Red");
                break;
                case 1: System.out.println("Yellow");
                break;
                default:System.out.println("Green");
                break;
            }
            Thread.sleep(timecode[i]*1000);
            if (i>1){
                i=-1;
            }
        }
    }
}
