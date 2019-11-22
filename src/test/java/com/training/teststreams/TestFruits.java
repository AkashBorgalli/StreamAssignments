package com.training.teststreams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.training.streams.Fruits;

public class TestFruits {
	Fruits fruit, fruit1, fruit2, fruit3, fruit4, fruit5;

	@Before
	public void objectsInitialization() {
		fruit = new Fruits("Banana", 200, 150, "Yellow");
		fruit1 = new Fruits("Mango", 400, 260, "Yellow");
		fruit2 = new Fruits("Apple", 600, 360, "Red");
		fruit3 = new Fruits("Strawberries", 400, 180, "Red");
		fruit4 = new Fruits("sitaphal", 50, 90, "Green");
		fruit5 = new Fruits("kiwi", 60, 44, "Green");
	}

	@Test
	public void testfruitwithCalories() {

		ArrayList<Fruits> names = new ArrayList<Fruits>();
		names.add(fruit);
		names.add(fruit1);
		names.add(fruit2);
		names.add(fruit3);
		names.add(fruit4);
		names.add(fruit5);
		ArrayList<Fruits> fr = names.stream().filter(n -> n.getCalories() < 100).sorted((n1, n2) -> {
			int result = Integer.compare(n2.getCalories(), n1.getCalories());
			if (result == 0)
				return Integer.compare(n2.getPrice(), n1.getPrice());
			return result;
		}).collect(Collectors.toCollection(ArrayList::new));
		// System.out.println(fr);
		ArrayList<Fruits> actual = new ArrayList<Fruits>();
		actual.add(fruit5);
		actual.add(fruit4);
		assertEquals(fr, actual);

	}

	@Test
	public void testfruitwithColor() {
		ArrayList<Fruits> names = new ArrayList<Fruits>();
		names.add(fruit);
		names.add(fruit1);
		names.add(fruit2);
		names.add(fruit3);
		names.add(fruit4);
		names.add(fruit5);
		HashMap<String, ArrayList<String>> parts = new HashMap<String, ArrayList<String>>();

		names.stream().forEach(fruit -> {

			if (parts.containsKey(fruit.getColor())) {
				ArrayList<String> obj = parts.get(fruit.getColor());
				obj.add(fruit.getName());
				parts.put(fruit.getColor(), obj);
			} else {
				ArrayList<String> obj = new ArrayList<String>();
				obj.add(fruit.getName());
				parts.put(fruit.getColor(), obj);
			}
		});

		System.out.println(parts);
	}

	@Test
	public void testfruitwithColorRedWithPriceAscending() {

		ArrayList<Fruits> names = new ArrayList<Fruits>();
		names.add(fruit);
		names.add(fruit1);
		names.add(fruit2);
		names.add(fruit3);
		names.add(fruit4);
		names.add(fruit5);
		ArrayList<Fruits> pr = names.stream().filter(n -> n.getColor().contains("Red")).sorted((n1, n2) -> {
			int result = Integer.compare(n1.getPrice(), n2.getPrice());
			if (result == 0)
				return Integer.compare(n2.getCalories(), n1.getCalories());
			return result;
		}).collect(Collectors.toCollection(ArrayList::new));
		
		ArrayList<Fruits> actual = new ArrayList<Fruits>();
		actual.add(fruit3);
		actual.add(fruit2);
		assertEquals(actual,pr);
	}

}
