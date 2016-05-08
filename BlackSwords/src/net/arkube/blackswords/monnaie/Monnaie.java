package net.arkube.blackswords.monnaie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.arkube.blackswords.utils.MySQL;

import org.bukkit.entity.Player;

public class Monnaie {

	private Player player;
	
	public Monnaie(Player player){
		this.player = player;
	}
	
	public Integer getMonnaie(){
		int monnaie = 0;
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("SELECT monnaie FROM ? WHERE ?");
			sts.setString(1, new MySQL().getTable());
			sts.setString(2, player.getUniqueId().toString());
			ResultSet rs = sts.executeQuery();
			if(rs.next()){
				monnaie = rs.getInt("monnaie");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return monnaie;
	}
	
	public void addMonnaie(int monnaie){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("UPDATE INTO ? monnaie = monnaie + ? WHERE uuid = ?");
			sts.setString(1, new MySQL().getTable());
			sts.setInt(2, monnaie);
			sts.setString(3, player.getUniqueId().toString());
			sts.executeUpdate();
			sts.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void removeMonnaie(int monnaie){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("UPDATE INTO ? monnaie = monnaie - ? WHERE uuid = ?");
			sts.setString(1, new MySQL().getTable());
			sts.setInt(2, monnaie);
			sts.setString(3, player.getUniqueId().toString());
			sts.executeUpdate();
			sts.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}