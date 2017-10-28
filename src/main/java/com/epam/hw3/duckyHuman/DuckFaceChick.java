package com.epam.hw3.duckyHuman;

import com.epam.hw3.typesOfFlight.FlyByPlaneLikeACapriciousWoman;
import com.epam.hw3.typesOfNoise.Quak;
import com.epam.hw3.typesOfSwimming.SwimLikeACapriciousWoman;

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
        if (makeASoundBehavior != null && flyBehavior != null && swimBehavior != null) {
            System.out.println("One of the most useless women of the human population is calling herself name \nand " +
                    "doing a duck face because she convinced that it make her more attractive");
        } else {
            throw new NullPointerException("Check the initialization of the objects includes types of " +
                    "duck behavior (Class " + this.getClass() + "). Anything of this object is empty.");
        }
    }
}
