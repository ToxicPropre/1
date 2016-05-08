package net.arkube.blackswords.rank;

import java.util.HashMap;

public enum Rank {

	ARRIVANT(10, "", "", ""),
	INITIE(20, "", "", ""),
	DEBUTANT(30, "", "", ""),
	AMATEUR(40, "", "", ""),
	VIP(50, "", "", ""),
	MODERATEUR(90, "", "", ""),
	ADMINISTRATEUR(100, "", "", "");
	
	private int level;
	private String name, prefix, color;
	
	Rank(int level, String name, String prefix, String color){
		this.level  = level;
		this.name = name;
		this.prefix = prefix;
		this.color = color;
	}
	
	private static HashMap<Integer, Rank> ID = new HashMap<Integer, Rank>();
	
	static{
		for(Rank rank : values()){
			ID.put(rank.level, rank);
		}
	}
	
	public static Rank getFromLevel(int level){
		return ID.get(level);
	}
	
	public Integer getLevel(){
		return level;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPrefix(){
		return prefix;
	}
	
	public String getColor(){
		return color;
	}
	
}
