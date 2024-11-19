package org.bescent.automation.Oct2024SeleniumBatch;

public class JavaClass7AM {

	void calling() {
		System.out.println("his");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Close DB connection");
	}

	public static void main(String[] args) {
		JavaClass7AM obj = new JavaClass7AM();
		obj.calling();
		System.gc();// garbage collector
	}
}
