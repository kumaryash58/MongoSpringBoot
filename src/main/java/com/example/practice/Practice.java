//package com.example.practice;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class Counter {
//	int count = 0;
//
//	public  void increamentNum() {
//		synchronized(Counter.class) {
//		count++;
//		}
//	}
//}
//
//class A{
//	public int fun() {
//		return 9;
//	}
//	
//
//
//	
//}
//
//class B{
//	public int fun() {
//		return 9;
//	}
//}
//
//class C extends A{}
//
//public class Practice implements Runnable {
//
//	static Counter p = new Counter();
//	
//	@Override
//	public void run() {
//		for (int i = 0; i < 10000; i++) {
//			p.increamentNum();
//		}
//	}
//
//	
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		List<String> list = List.of("ss", "sy", "aa");
//	Map<String, Integer> map =	list.stream().collect(Collectors.toMap(String::toString, s->s.length()));
//	Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//	stream.forEach(i->System.out.println("ii="+i));
//	
//		int c = 848;
//	     int temp = c;
//	        int rem =0;
//	        int rev = 0;
//	        while(c>0){
//	            rem = c%10; 
//	            rev = rev*10 + rem;
//	            rem = 0;
//	            c = c/10;
//	        }
//	       System.out.println(rev);
//	       System.out.println(LocalDateTime.now());
////		CompletableFuture<String> tas = CompletableFuture.supplyAsync(()->{
////		return "Hello";
////		});
////		System.out.println("str " + tas.get());
//////		tas.thenApply(i->System.out.println(i));
////		
////	for(char c : tas.get().toCharArray()) {
////		System.out.println("str " + c);
////	}
////	List<String> list = List.of("ss", "sy", "aa");
////	String s1 = "Hello";
//		long start = System.nanoTime();
//		Practice pp = new Practice();
//		Thread t1 = new Thread(pp);
//		Thread t2 = new Thread(pp);
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		long end = System.nanoTime();
//		System.out.println("total time  = "+ (end-start) + " count = " + p.count);
//	}
//
//
//
//}
