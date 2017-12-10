package com.epam.vol2.operators.procedures;

import com.epam.vol2.operators.procedures.e2.Sequence;
import com.epam.vol2.operators.procedures.e3.FunctionWithX;

public class RunExercises {
    public static void main(String[] args) {
        RunExercises runExercises = new RunExercises();
        runExercises.start();

    }

    public void start() {
        Sequence sequence = new Sequence();
        FunctionWithX functionWithX = new FunctionWithX();

        //        System.out.println(sequence.minWithCondition(-1, 7));
        System.out.println(functionWithX.function(0, 5, 2));


    }
}
