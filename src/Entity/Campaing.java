package Entity;

public class Campaing {
	
	private int campaingCode;
	public int getCampaingCode() {
		return campaingCode;
	}

	public void setCampaingCode(int campaingCode) {
		this.campaingCode = campaingCode;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	private String campaingName;
	private int discount;
	
	public Campaing(int campaingCode, String campaingName, int discount) {
		this.campaingCode = campaingCode;
		this.campaingName = campaingName;
		this.discount = discount;
	}
	
	
	
	

}
