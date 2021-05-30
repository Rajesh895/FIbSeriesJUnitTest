package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Demo1Application.class, args);
	}

	public void PrintFibseries(int num)
	{
		int n=10;

		int fib=0;
		int fib1=1;
		int fib2=0;

		for(int i=0; i<n; i++)
		{
			fib= fib1+fib2;
			fib1= fib2;
			fib2 =fib;
			if(fib>num)
			{
				break;
			}

			System.out.println(fib);
		}

	}


}
