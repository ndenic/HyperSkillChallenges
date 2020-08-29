/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.anonymousClasses;

/**
 *
 * @author nikolad
 */
class IteratorExecutor {

    static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
        for (int i = 0; i < numberOfIterations; i++) {
            callback.onNewIteration(i);
        }
    }

    static void startIterations(int numberOfIterations) {
        performIterationsWithCallback(numberOfIterations, new LoopCallback() {

			public void onNewIteration(int iteration) {
				System.out.println("Iteration: " + iteration);

			}
		});
    }
}

// Don't change the code below
interface LoopCallback {

    void onNewIteration(int iteration);
}