package com.integrationwizards.common;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PingCheck {
	private static boolean accessToRetriever = false;
	private static boolean accessToM3 = false;
	
	@Scheduled(fixedDelay = 10000)
	private void sendPing() {
		// check Retriever server
		setAccessToRetriever(sendPing(Constants.retrieverServerURL, 80));
		// check M3 server
		setAccessToM3(sendPing(Constants.m3ServerURL, Constants.m3ServerPort));
		
		//checkServerAlive();
	}	
	
	public boolean sendPing(String URL, int port) {
		Socket socket = null;
		boolean reachable = false;
		try {
		    socket = new Socket(URL, port);
		    reachable = true;
		}
		catch(IOException e) {
			System.out.println(e.getMessage() + " => " + URL + ":" + port);
		}
		finally {            
		    if (socket != null) try { socket.close(); } catch(IOException e) {}
		}
		
		return reachable;
	}
	
	private void checkServerAlive() {
		String url = "http://www.google.com/search?q=mkyong";
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	
			// optional default is GET
			con.setRequestMethod("GET");
	
			//add request header
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
	
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isAccessToRetriever() {
		return accessToRetriever;
	}
	
	public void setAccessToRetriever(boolean accessToRetriever) {
		PingCheck.accessToRetriever = accessToRetriever;
	}

	public static boolean isAccessToM3() {
		return accessToM3;
	}

	public void setAccessToM3(boolean accessToM3) {
		PingCheck.accessToM3 = accessToM3;
	}
}
