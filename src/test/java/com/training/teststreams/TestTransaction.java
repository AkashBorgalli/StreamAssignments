package com.training.teststreams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.training.streams.Trader;
import com.training.streams.Transaction;

public class TestTransaction {
	Transaction trader, trader1, trader2, trader3, trader4;

	@Before
	public void objectsInitialization() {
		trader = new Transaction("Akash", "Mumbai", 1998, 25);
		trader1 = new Transaction("Vicky", "Delhi", 2007, 10);
		trader2 = new Transaction("Satish", "Delhi", 1997, 50);
		trader3 = new Transaction("Nivedita", "Indore", 2019, 60);
		trader4 = new Transaction("Indu", "Agra", 2017, 70);

	}

	@Test
	public void testprintTransaction() {
		ArrayList<Transaction> transaction = new ArrayList<Transaction>();
		transaction.add(trader);
		transaction.add(trader1);
		transaction.add(trader2);
		transaction.add(trader3);
		transaction.add(trader4);
		List<Integer> values = transaction.stream().filter(t -> t.getCity()
				              .equals("Delhi")).map(m -> m.getValue())
				              .collect(Collectors.toList());
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(10);
		result.add(50);
		assertEquals(values, result);
    }
	@Test
	public void testprinthighestValue() {
		ArrayList<Transaction> transaction = new ArrayList<Transaction>();
		transaction.add(trader);
		transaction.add(trader1);
		transaction.add(trader2);
		transaction.add(trader3);
		transaction.add(trader4);
		int highest = transaction.stream().map(m -> m.getValue()).sorted().max(Integer::compare).get();
	    int actual = 70;
		assertEquals(highest,actual);
    }
	@Test
	public void testprintSmallestValue() {
		ArrayList<Transaction> transaction = new ArrayList<Transaction>();
		transaction.add(trader);
		transaction.add(trader1);
		transaction.add(trader2);
		transaction.add(trader3);
		transaction.add(trader4);
		int lowest = transaction.stream().map(m -> m.getValue()).sorted().min(Integer::compare).get();
	    int actual = 10;
		assertEquals(lowest,actual);
    }

}
