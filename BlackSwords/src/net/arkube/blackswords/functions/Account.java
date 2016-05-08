package net.arkube.blackswords.functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.arkube.blackswords.utils.ChatUtil;
import net.arkube.blackswords.utils.MySQL;

import org.bukkit.entity.Player;

public class Account {

	private Player player;
	
	public Account(Player player){
		this.player = player;
	}
	
	public void createAccount(){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("SELECT name FROM ? WHERE uuid = ?");
			sts.setString(1, new MySQL().getTable());
			sts.setString(2, player.getUniqueId().toString());
			ResultSet rs = sts.executeQuery();
			if(!rs.next()){
				sts = new MySQL().getConnection().prepareStatement("INSERT INTO ? (pseudo, uuid, ip, rank, monnaie) VALUES (?, ?, ?, 10, 500)");
				sts.setString(1, new MySQL().getTable());
				sts.setString(2, player.getName());
				sts.setString(3, player.getUniqueId().toString());
				sts.setString(4, player.getAddress().getHostName());
				sts.executeUpdate();
				sts.close();
				player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de reçevoir §a500 §fde monnaie pour votre première connection !");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void changeName(){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("SELECT name FROM ? WHERE uuid = ?");
			sts.setString(1, new MySQL().getTable());
			sts.setString(2, player.getUniqueId().toString());
			ResultSet rs = sts.executeQuery();
			if(rs.next()){
				if(rs.getString("pseudo") != player.getName()){
					sts = new MySQL().getConnection().prepareStatement("UPDATE INTO ? pseudo = ? WHERE uuid = ?");
					sts.setString(1, new MySQL().getTable());
					sts.setString(2, player.getName());
					sts.setString(3, player.getUniqueId().toString());
					sts.executeUpdate();
					sts.close();
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
