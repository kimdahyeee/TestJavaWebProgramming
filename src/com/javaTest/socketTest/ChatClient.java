package com.javaTest.socketTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader =null;
	
	public ChatClient() {
		try {
			socket = new Socket("localhost", 2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String str = null;
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			
			while((str = sReader.readLine()) != null){
				writer.println(str);
				System.out.println("output: " + str);
			}
			
			writer.close();
			reader.close();
			sReader.close();
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		new ChatClient();
	}
}
