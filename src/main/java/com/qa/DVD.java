package com.qa;

public class DVD extends Item {

	private int runTime;

	public DVD(String title, int runTime) {
		super(title);
		this.setRunTime(runTime);
	}

	public int getRunTime() {
		return this.runTime;
	}

	public void setRunTime(int runTime) {
		if (runTime > 0 && runTime < 1_000) {
			this.runTime = runTime;
		}
	}

}
