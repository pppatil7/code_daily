package com.score;

public class PlayerDetails {

	int playerId;
	String playerName;
	int playerAge;
	String playerCountry;
	int playerScore;

	public PlayerDetails() {
		super();
	}

	public PlayerDetails(int playerId, String playerName, int playerAge, String playerCountry, int playerScore) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerCountry = playerCountry;
		this.playerScore = playerScore;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "PlayerDetails [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", playerCountry=" + playerCountry + ", playerScore=" + playerScore + "]";
	}

}
