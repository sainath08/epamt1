package Epamtask.Epamtask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class epamTestTask {

	DeleteOp d;

	@BeforeEach
	void createObject() {
		d = new DeleteOp();
	}

	@Test
	void test1() {
		assertEquals("BCD", d.del("ABCD"));
	}

	@Test
	void test2() {
		assertEquals("CD", d.del("AACD"));
	}

	@Test
	void test3() {
		assertEquals("BBAA", d.del("BBAA"));
	}

	@Test
	void test4() {
		assertEquals("", d.del("A"));
	}

	@Test
	void test5() {
		assertEquals("", d.del("AA"));
	}

	@Test
	void test6() {
		assertEquals("BB", d.del("BAB"));
	}

}