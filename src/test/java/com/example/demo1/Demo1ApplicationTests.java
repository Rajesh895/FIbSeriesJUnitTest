package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo1ApplicationTests {

    @MockBean
    Demo1Application demo1Application;

	@Test
	void contextLoads() {
	    int num=50;
		demo1Application.PrintFibseries(num);

	}

}
