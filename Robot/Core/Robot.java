package Robot.Core;

import java.util.*;

public class Robot{
	private String m_name;

	public Robot(String t_name){
		this.m_name = t_name;
	}

	public String getName(){
		return this.m_name;
	}

	public String listen(){
		Scanner sc = new Scanner(System.in);

		String res = sc.next();

		return res;
	}

	public void say(String words){
		System.out.println(words);
	}

	public void execute(String request){
		if(false){}
		else if(false){}
		else if(false){}
		else{
			this.say("I am sorry, but I can't understand what you have said...");
		}	
	}
}