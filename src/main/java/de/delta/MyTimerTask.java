package de.delta;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.err.println("EXEC");
		User32Ext.childWindows();
	}

	public void stop() {
		System.err.println("STOP");
		cancel();
	}
}
