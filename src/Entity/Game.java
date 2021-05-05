package Entity;

public class Game {
	
	private int gameId;
	private String gameName;
	private int year;
	private double price;
	
	public Game(int gameId, String gameName, int year, double price) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.year = year;
		this.price = price;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
