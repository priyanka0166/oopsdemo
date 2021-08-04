package oopsdemo1;

/* Java program to perform addition of 2 Time
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */

public class Time {
	
	int hr, min, sec;
	
	Time()
	{
		hr = min = sec = 0;
	}
	
	Time(int h, int m, int s)
	{
		hr = h;
		min = m;
		sec = s;
	}
	
	void add(Time t)
	{
		this.hr += t.hr;
		this.sec += t.sec;
		this.min += t.min;
		
		if(this.sec >= 60)
		{
			min = min+1;
			sec = sec-60;
		}
		
		if(this.min >= 60)
		{
			hr = hr+1;
			min = min-60;
		}
		
		
	}
	
	void display()
	{
		System.out.println(this.hr + " : "+ this.min + " : "+ this.sec);
	}
	

}
