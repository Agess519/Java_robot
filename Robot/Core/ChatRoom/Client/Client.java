package ChatRoom.Client;

import ChatRoom.Core.*;

public class Client{
	private ChatRoom chatroom;

	// public void init(String name){
	// 	this.chatroom = new ChatRoom();
	// }

	public void run(){
		System.out.println("Welcome to the " + this.room_name + " !!");

		System.out.println("----------------------------\n" + 
							"& <r> register a new account\n" + 
							"& <l> log in your account" + 
							"& <q> exit the chatroom" + 
							"----------------------------\n" + 
							"& ");

		Scanner sc = new Scanner(System.in);
		String op = sc.next();

		while(true){
			if(op == "q"){
				break;
			}
			else if(op == "r"){
				if(this.chatroom.register()){
					System.out.println("Success!");
				}
				else{
					System.out.println("Faild, " + 
					"please make sure your ID and password are correct.");	
				}
			}
			else if(op == "l"){
				try{
					this.chatroom.login();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			System.out.println("& ");
			op = sc.next();
		}

		System.out.println("Welcome for your next arrival!!");

	}
}