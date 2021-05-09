package Entities.Abstract;

import Entities.Concrete.Campaign;

public interface Item {

	public double getPrice();
	public String getName();
	public void setPrice(double price);
	public void setCampaign(Campaign campaign);
	
}
