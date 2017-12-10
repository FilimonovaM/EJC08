package com.epam.vol2.oop.ex6;

import com.epam.vol2.oop.ex7.DoSomething;


public class Submarine {

    /**
     * uses to get a phrase from the inner class Engine.
     *
     * @return phrase from inner class
     */
    @DoSomething(value = 10, author = "Me&MyCat")
    public String prepareSubmarine() {
        Engine engine = new Engine();
        return engine.drive();
    }

    public class Engine {
        /**
         * uses to set a phrase to mine().
         *
         * @return phrase from this inner class
         */
        public String drive() {
            return "We are live in a yellow submarine!";
        }
    }
}
