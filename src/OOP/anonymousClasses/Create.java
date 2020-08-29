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
class Create {

    public static Runnable createRunnable(String text, int repeats) {
        final int n = repeats;
		final String txt = text;
		return new java.lang.Runnable() {
			public void run() {
				for (int i = 0; i < n; i++) {
					System.out.println(txt);
				}
			}
		};
    }
}
