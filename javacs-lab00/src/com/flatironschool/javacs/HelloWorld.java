package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String prop = "unknown";
        prop = System.getProperty("java.specification.version");
        //System.out.println(prop);

        return Double.parseDouble(prop);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
        // System.out.println(getVersion());
        getVersion();

    }

}
