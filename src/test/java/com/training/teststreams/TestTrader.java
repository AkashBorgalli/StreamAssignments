package com.training.teststreams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.training.streams.Trader;

public class TestTrader {
	Trader trader, trader1, trader2, trader3, trader4;

	@Before
	public void objectsInitialization() {
		trader = new Trader("Akash", "Mummbai");
		trader1 = new Trader("Vicky", "Pune");
		trader2 = new Trader("Satish", "Pune");
		trader3 = new Trader("Nivedita", "Indore");
		trader4 = new Trader("Indu", "Agra");

	}

	@Test
	public void testPuneSortByName() {
		ArrayList<Trader> trade = new ArrayList<Trader>();
		trade.add(trader);
		trade.add(trader1);
		trade.add(trader2);
		trade.add(trader3);
		trade.add(trader4);
		List<String> cp = trade.stream().filter(city -> city.getCity().equals("Pune")).map(l -> l.getName()).sorted()
				.collect(Collectors.toList());
		String a[] = new String[] { "Satish", "Vicky" };

		List<String> list = Arrays.asList(a);

		assertEquals(list, cp);
		// System.out.println(cp);

	}

	@Test
	public void displayUniqueCity() {
		Set<Trader> trade = new HashSet<Trader>();
		trade.add(trader);
		trade.add(trader1);
		trade.add(trader2);
		trade.add(trader3);
		trade.add(trader4);
		Set<String> uniqueCities = trade.stream().map(c -> c.getCity()).collect(Collectors.toSet());
		Set<String> list = new LinkedHashSet<String>();
		list.add("Pune");
		list.add("Agra");
		list.add("Mummbai");
		list.add("Indore");
        assertEquals(list, uniqueCities);

	}
	@Test
	public void displaytradername() {
		Set<Trader> trade = new TreeSet<Trader>();
		trade.add(trader);
		trade.add(trader1);
		trade.add(trader2);
		trade.add(trader3);
		trade.add(trader4);
		//System.out.println(trade);
		Set<String> uniqueNames = trade.stream()
									   .map(c -> c.getName())
									   .collect(Collectors.toSet());
		
		Set<String> list = new TreeSet<String>();
		list.add("Akash");
		list.add("Indu");
		list.add("Nivedita");
		list.add("Satish");
		list.add("Vicky");
	    assertEquals(list, uniqueNames);
	}
	@Test
	public void displaytraderWthIndore() {
		Set<Trader> trade = new HashSet<Trader>();
		trade.add(trader);
		trade.add(trader1);
		trade.add(trader2);
		trade.add(trader3);
		trade.add(trader4);
		
		Set<String> uniqueNames = trade.stream().filter(i ->i.getCity().equals("Indore"))
									   .map(c -> c.getName())
									   .collect(Collectors.toSet());
		Set<String> list = new HashSet<String>();
		
		list.add("Nivedita");
		
	    assertEquals(list, uniqueNames);
	}
	

}
