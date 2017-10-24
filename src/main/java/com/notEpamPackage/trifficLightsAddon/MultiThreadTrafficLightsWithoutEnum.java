package com.notEpamPackage.trifficLightsAddon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiThreadTrafficLightsWithoutEnum extends Throwable {
    int timecode[] = {2, 3, 5};
    int maxCount = 59;

    /**
     * uses to create a InputStream & to start the TrafficLights
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        MultiThreadTrafficLightsWithoutEnum multiThreadTrafficLightsWithoutEnum =
                new MultiThreadTrafficLightsWithoutEnum();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        multiThreadTrafficLightsWithoutEnum.runTheTrafficLights(bufferedReader);
        bufferedReader.close();
    }


    /**
     * uses for finding what the color is lighting now
     * !!! This method uses the param that you enter, but it can use s default params
     *
     * @param bufferedReader immigrate across this method to the class Reader to give your variant of param.
     */
    private void runTheTrafficLights(BufferedReader bufferedReader) throws InterruptedException {
        Reader reader = new Reader();
        maxCount = reader.read(bufferedReader);
        if (maxCount < 0) {
            System.out.println("The param was not selected. TrafficLights will be loaded with standard param");
        }
        while (true) {
            int iterationCount = 0;
            for (int i = 0; ; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Red");
                        break;
                    case 1:
                        System.out.println("Yellow");
                        break;
                    default:
                        System.out.println("Green");
                        break;
                }
                if (iterationCount + timecode[i] <= maxCount) {
                    Thread.sleep(timecode[i] * 1000);
                } else {
                    int shortSleeping = maxCount - iterationCount;
                    Thread.sleep(shortSleeping * 1000);
                    break;
                }
                iterationCount += timecode[i];
                if (i > 1) {
                    i = -1;
                }
            }
        }
    }
}
