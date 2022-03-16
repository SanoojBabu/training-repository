package com.te.intefaces;

public class Impl implements Left,Right {
	@Override
	public void m1() {
		Right.super.m1();
	}
}
