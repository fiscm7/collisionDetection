/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silverstar.collisiondetection;


import com.tinkerforge.IPConnection;
import com.tinkerforge.BrickletDistanceUS;

public class ReadIt {
    
    //test for commit
    
	private static final String HOST = "localhost";
	private static final int PORT = 4223;

	// Change XYZ to the UID of your Distance US Bricklet
	private static final String UID1 = "q99";
        private static final String UID2 = "jAL";
        private static final String UID3 = "jAY";
        private static final String UID4 = "q95";

	// Note: To make the example code cleaner we do not handle exceptions. Exceptions
	//       you might normally want to catch are described in the documentation
        public static void main(String args[]) throws Exception {
		IPConnection ipcon = new IPConnection(); // Create IP connection
		BrickletDistanceUS dus1 = new BrickletDistanceUS(UID1, ipcon); // Create device object
                BrickletDistanceUS dus2 = new BrickletDistanceUS(UID2, ipcon); // Create device object
                BrickletDistanceUS dus3 = new BrickletDistanceUS(UID3, ipcon); // Create device object
                BrickletDistanceUS dus4 = new BrickletDistanceUS(UID4, ipcon); // Create device object

		ipcon.connect(HOST, PORT); // Connect to brickd
		// Don't use device before ipcon is connected

		// Add distance value listener
		dus1.addDistanceListener((int distance) -> {
                    System.out.println("Distance Value 1: " + distance);
                });

		// Set period for distance value callback to 0.2s (200ms)
		// Note: The distance value callback is only called every 0.2 seconds
		//       if the distance value has changed since the last call!
		dus1.setDistanceCallbackPeriod(1000);

		// Add distance value listener
		dus2.addDistanceListener((int distance) -> {
                    System.out.println("Distance Value 2: " + distance);
                });

		// Set period for distance value callback to 0.2s (200ms)
		// Note: The distance value callback is only called every 0.2 seconds
		//       if the distance value has changed since the last call!
		dus2.setDistanceCallbackPeriod(1000);

		// Add distance value listener
		dus3.addDistanceListener((int distance) -> {
                    System.out.println("Distance Value 3: " + distance);
                });

		// Set period for distance value callback to 0.2s (200ms)
		// Note: The distance value callback is only called every 0.2 seconds
		//       if the distance value has changed since the last call!
		dus3.setDistanceCallbackPeriod(1000);

		// Add distance value listener
		dus4.addDistanceListener((int distance) -> {
                    System.out.println("Distance Value 4: " + distance);
                });

		// Set period for distance value callback to 0.2s (200ms)
		// Note: The distance value callback is only called every 0.2 seconds
		//       if the distance value has changed since the last call!
		dus4.setDistanceCallbackPeriod(1000);

		System.out.println("Press key to exit"); System.in.read();
		ipcon.disconnect();
	}
}
