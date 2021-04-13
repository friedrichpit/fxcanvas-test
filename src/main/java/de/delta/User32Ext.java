package de.delta;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.win32.W32APIOptions;

public interface User32Ext extends User32 {

	User32Ext INSTANCE = Native.load("user32", User32Ext.class, W32APIOptions.DEFAULT_OPTIONS);

	UINT CWP_ALL = new UINT(0);
	UINT CWP_SKIPINVISIBLE = new UINT(1);
	UINT CWP_SKIPDISABLED = new UINT(2);
	UINT CWP_SKIPINVISIBLE_DISABLED = new UINT(CWP_SKIPINVISIBLE.longValue() | CWP_SKIPDISABLED.longValue());
	UINT CWP_SKIPTRANSPARENT = new UINT(4);

	HWND ChildWindowFromPointEx(HWND hwnd, POINT pt, UINT flags);

	static void childWindows() {
		User32Ext.INSTANCE.EnumChildWindows(User32Ext.INSTANCE.GetForegroundWindow(), new WNDENUMPROC() {

			@Override
			public boolean callback(HWND hwnd, Pointer data) {
				char[] textBuffer = new char[512];
	            char[] textBuffer2 = new char[512];
	            User32.INSTANCE.GetClassName(hwnd, textBuffer, 512);
	            User32.INSTANCE.GetWindowText(hwnd, textBuffer2, 512);
	            String wText = Native.toString(textBuffer);
	            String wText2 = Native.toString(textBuffer2);

	            System.out.println("className: " + wText + " title: " + wText2);
				return true;
			}
		}, null);
	}
}
