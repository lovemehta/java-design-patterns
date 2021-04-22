package com.lovemehta.java_design_patterns.behavioral.observer;

public class ObserverPatternDriver {

	public static void main(String[] args) {

		NewsAgency newsAgency = new NewsAgency();
		NewsChannel channel = new NewsChannel();

		newsAgency.addObserver(channel);
		newsAgency.setNews("news");

		if (channel.getNews().equals("news")) {

			System.out.println("News set successfully.");

		}
	}

}
