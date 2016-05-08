package net.arkube.blackswords.functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.arkube.blackswords.rank.Rank;
import net.arkube.blackswords.utils.MySQL;

import org.bukkit.entity.Player;


public class RankFunction {

	private Player player;
	
	public RankFunction(Player player){
		this.player = player;
	}
	
	public void setRank(Rank rank){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("UPDATE INTO "+new MySQL().getTable()+" rank = ? WHERE uuid = ?");
			sts.setInt(1, rank.getLevel());
			sts.setString(2, player.getUniqueId().toString());
			sts.executeUpdate();
			sts.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public Rank getRank(){
		Rank rank = null;
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("SELECT rank FROM accounts WHERE uuid = ?");
			sts.setString(1, player.getUniqueId().toString());
			ResultSet rs = sts.executeQuery();
			if(!rs.next()){}
			rank = Rank.getFromLevel(rs.getInt("rank"));
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rank;
	}
	
	public boolean hasPermission(String permission){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("SELECT permissions FROM accounts WHERE uuid = ?");
			sts.setString(1, player.getUniqueId().toString());
			ResultSet rs = sts.executeQuery();
			if(rs.getString("permissions").contains(permission)){
				return true;
			}else{
				return false;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public void addPermission(String permission){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("UPDATE INTO accounts permissions = ? WHERE uuid = ?");
			sts.setString(1, permission);
			sts.setString(2, player.getUniqueId().toString());
			sts.executeUpdate();
			sts.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void removePermission(String permission){
		try{
			PreparedStatement sts = new MySQL().getConnection().prepareStatement("REMOVE INTO accounts permissions = ? WHERE uuid = ?");
			sts.setString(1, permission);
			sts.setString(2, player.getUniqueId().toString());
			sts.executeUpdate();
			sts.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
