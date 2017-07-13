package com.turreta.junit4.repeatedtest;

import com.turreta.junit4.repeatedtest.util.RepeatTest;
import com.turreta.junit4.repeatedtest.util.RepeatedTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComTurretaJunit4RepeatedtestApplicationTests {

	@Rule
	public RepeatedTestRule repeatRule = new RepeatedTestRule();

	@Test
	@RepeatTest(times = 7)
	public void repeatedTestExample() {
		System.out.println("Test example");
	}
}
