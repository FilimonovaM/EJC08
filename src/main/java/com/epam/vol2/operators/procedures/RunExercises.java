package com.epam.vol2.operators.procedures;

import com.epam.vol2.operators.procedures.e2.Sequence;
import com.epam.vol2.operators.procedures.e3.FunctionWithX;
import com.epam.vol2.operators.procedures.e4.SimpleArrays;
import com.epam.vol2.operators.procedures.e5.MultidimensionalArrays;
import com.epam.vol2.operators.procedures.e6.WriteTheNote;

public class RunExercises {
    public static void main(String[] args) {
        RunExercises runExercises = new RunExercises();
        runExercises.start();

    }

    /**
     * uses for starting of exercises.
     */
    public void start() {
        Sequence sequence = new Sequence();
        FunctionWithX functionWithX = new FunctionWithX();
        SimpleArrays simpleArrays = new SimpleArrays();
        MultidimensionalArrays multidimensionalArrays = new MultidimensionalArrays();
        WriteTheNote writeTheNote = new WriteTheNote();

        System.out.println(sequence.minWithCondition(-1, 7));
        System.out.println(functionWithX.function(0, 5, 2));
        System.out.println(simpleArrays.maximum(5, 6, 2, 8, 6));
        System.out.println(multidimensionalArrays.show(5));
        System.out.println(writeTheNote.start());
    }
}
