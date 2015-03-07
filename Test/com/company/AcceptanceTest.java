package com.company;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class AcceptanceTest {
	@Test
	public void hasPath_returns_Bangalore_and_Singapore_for_Bangalore_to_Singapore (){
		Map map = new Map();
		map.setup();
		List<String> stations = map.hasPath("Bangalore","Singapore");
		assertEquals("Bangalore",stations.get(0));
        assertEquals("Singapore",stations.get(1));
	}

    @Test
    public void hasPath_returns_Singapore_and_Bangalore_for_Singapore_to_Bangalore (){
        Map map = new Map();
        map.setup();
        List<String> stations = map.hasPath("Singapore","Bangalore");
        assertEquals("Singapore",stations.get(0));
        assertEquals("Bangalore",stations.get(1));
    }

	@Test
	public void hasPath_returns_Bangalore_Singapore_Seoul_Beijing_Tokyo_for_Bangalore_to_Tokyo (){
		Map map = new Map();
		map.setup();
		List<String> stations = map.hasPath("Bangalore","Tokyo");
		assertEquals("Bangalore",stations.get(0));
		assertEquals("Singapore",stations.get(1));
		assertEquals("Seoul",stations.get(2));
		assertEquals("Beijing",stations.get(3));
		assertEquals("Tokyo",stations.get(4));
	}

	@Test
	public void hasPath_returns_reversed_Path_for_Tokyo_to_Bangalore (){
		Map map = new Map();
		map.setup();
		List<String> stations = map.hasPath("Tokyo","Bangalore");
		assertEquals("Tokyo",stations.get(0));
		assertEquals("Beijing",stations.get(1));
		assertEquals("Seoul",stations.get(2));
		assertEquals("Singapore",stations.get(3));
		assertEquals("Bangalore",stations.get(4));
	}

    @Test
    public void hasPath_returns_path_for_Tokyo_to_Dubai (){
        Map map = new Map();
        map.setup();
        List<String> stations = map.hasPath("Tokyo","Dubai");
        assertEquals("Tokyo",stations.get(0));
        assertEquals("Beijing",stations.get(1));
        assertEquals("Seoul",stations.get(2));
        assertEquals("Singapore",stations.get(3));
        assertEquals("Dubai",stations.get(4));
    }

    @Test
    public void hasPath_returns_path_for_Beijing_to_Dubai (){
        Map map = new Map();
        map.setup();
        List<String> stations = map.hasPath("Beijing","Dubai");
        assertEquals("Beijing",stations.get(0));
        assertEquals("Seoul",stations.get(1));
        assertEquals("Singapore",stations.get(2));
        assertEquals("Dubai", stations.get(3));

    }

	@Test
	public void isCityPresent_returns_false_for_Chennai (){
		Map map = new Map();
		map.setup();
		assertEquals(false,map.isCityPresent("Chennai"));
	}

	@Test
	public void isCityPresent_returns_true_for_Tokyo (){
		Map map = new Map();
		map.setup();
		assertEquals(true,map.isCityPresent("Tokyo"));
	}
}