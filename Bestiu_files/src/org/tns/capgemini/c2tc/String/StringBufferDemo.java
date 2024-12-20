package org.tns.capgemini.c2tc.String;

public class StringBufferDemo {

	public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer ("start\n");
		
		Thread thread1=new Thread(()->{
			buffer.append("Message from thread1\n");
		});
		
		Thread thread2=new Thread(()->{
			buffer.append("Message from thread2\n");
		});

		thread1.start();
		thread2.start();
		
		try
		{thread1.join();
		thread2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Final stringbuffer\n" + buffer.toString());
	}
	}
