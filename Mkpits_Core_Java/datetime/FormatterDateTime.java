package com.mkpits.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Before Formatting Date and Time " + dateTime);

		// The ofPattern method here accepts all sorts of values
		DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM-dd-yyyy");

		String formatter = dateTime.format(format);
		System.out.println(formatter);

	}

}
