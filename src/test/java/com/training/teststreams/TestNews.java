/**
 * 
 */
package com.training.teststreams;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.streams.News;

/**
 * @author aborgall
 *
 */
public class TestNews {
	News news,news1,news2,news3,news4;
	@Before
	public void objectsInitialization() {
		news = new News(1234,"Newton","Akash","he is Scientist");
		news1 = new News(1234,"Newton","Aluu","he is budget");
		news2 = new News(1234,"Newton","deepika","he is Scientist");
		news3 = new News(1224,"Newton","Akash","he is budget");
		news4 = new News(1134,"venom","jicks","he is devil");
		
	}

	@Test
	public void testMaxId() {
		
		
	}

}
