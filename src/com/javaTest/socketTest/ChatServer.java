package com.javaTest.socketTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	ServerSocket serverSocket = null; //서버단에는 serverSocket추가
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;
	
	public ChatServer() {
		try {
			serverSocket = new ServerSocket(2000);
			
			while(true){
				socket = serverSocket.accept();
				System.out.println("Client 요청");
				
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				while((lineStr = reader.readLine()) != null){
					writer.write(lineStr);
					System.out.println("input : "+lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
