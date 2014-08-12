package com.example.openalpr;

public class NativeAlpr {
	static {
		System.loadLibrary("nativealpr");
	}
	
	public native String stringFromJNI();
}
