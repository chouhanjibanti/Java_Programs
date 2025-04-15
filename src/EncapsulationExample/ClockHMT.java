package EncapsulationExample;

public class ClockHMT {

	// properties
	private int hr;// hour
	private int min;
	private int sec;

	public ClockHMT() {
		super();
	}

	public ClockHMT(int hr, int min, int sec) {
		super();
		if ((hr > 0 && hr <= 12) && (min > 0 && min < 60) && (sec > 0 && sec < 60)) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		} else {
			System.out.println("Invalid time values ");
			this.hr = 0;
			this.min = 0;
			this.sec = 0;
		}
	}

	// behaviour // non static method
	public void showTime() {
		System.out.println("hour : " + hr + " " + " minute: " + min + "" + " second: " + sec);
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		if (hr > 0 && hr < 12) {
			this.hr = hr;
		} else {
			System.out.println("hour is wrong");
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min > 0 && min < 60) {
			this.min = min;
		} else {
			System.out.println("minute is wrong");
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec > 0 && sec < 60) {
			this.sec = sec;
		} else {
			System.out.println("Second is wrong");
		}
	}

}
