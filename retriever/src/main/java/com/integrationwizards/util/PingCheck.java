package com.integrationwizards.util;

import java.io.IOException;
import java.net.Socket;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PingCheck {
	private static boolean accessToRetriever = false;
	private static boolean accessToM3 = false;
	
	@Scheduled(fixedDelay = 10000)
	private void sendPing() {
		// check Retriever server
		setAccessToRetriever(sendPing(ConstantUtil.retrieverServerURL, 80));
		// check M3 server
		setAccessToM3(sendPing(ConstantUtil.m3ServerURL, ConstantUtil.m3ServerPort));
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
