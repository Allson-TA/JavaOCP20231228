package day01;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		String[] cars = {"Honda","Toyota","BMW","Benz","BYD","Tesla"};
		System.out.println(cars);
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars[4]);
		System.out.println(cars[5]);
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		for(String car:cars) {
			System.out.println(car);
		}
		
		System.out.println(Arrays.toString(cars));
		
		String[] copiedCars = new String[cars.length];
	
		//System.arraycopy(cars, 0, copiedCars, 0, cars.length);
		//System.out.println(Arrays.toString(copiedCars));
		
		System.arraycopy(cars, 0, copiedCars, 2, 2);
		System.out.println(Arrays.toString(copiedCars));
		
		
	}

}
