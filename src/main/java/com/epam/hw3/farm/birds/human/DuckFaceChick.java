package com.epam.hw3.farm.birds.human;

import com.epam.hw3.farm.behavior.flight.FlyByPlaneLikeACapriciousWoman;
import com.epam.hw3.farm.behavior.noise.Quak;
import com.epam.hw3.farm.behavior.swimming.SwimLikeACapriciousWoman;

public class DuckFaceChick extends HomoSapience {

    public DuckFaceChick() {
        flyBehavior = new FlyByPlaneLikeACapriciousWoman();
        makeASoundBehavior = new Quak();
        swimBehavior = new SwimLikeACapriciousWoman();
    }

    /**
     * uses for personal presentation of the classes which extends from the superclass HomoSapience.
     */
    @Override
    public void presentHerself() {
        System.out.println("One of the most useless women of the human population is calling herself name \nand " +
                "doing a birds face because she convinced that it makes her more attractive.");
        if (makeASoundBehavior != null && flyBehavior != null && swimBehavior != null) {
            System.out.println("She is ready to test her properties!");
        } else {
            throw new NullPointerException("Check the initialization of the objects includes birds of " +
                    "birds behavior (" + this.getClass() + "). Anything of this object is empty.");
        }
    }
}
