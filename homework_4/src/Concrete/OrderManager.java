package Concrete;

import Entities.Abstract.Item;
import Entities.Concrete.Gamer;
import Entities.Concrete.Campaign;

public class OrderManager {
	
	private Item item;
	private Campaign campaign;
	private Gamer gamer;
	
	public OrderManager(Item item, Gamer gamer){
		this.item=item;
		this.gamer=gamer;
	}
	
	public OrderManager(Item item, Gamer gamer,Campaign campaign){
		this.item=item;
		this.campaign=campaign;
		this.gamer=gamer;
	}

	public void Sell() {
		if(this.campaign==null) {
			System.out.println("Item "+item.getName()+" sold by "+item.getPrice()+" to "+this.gamer.getFullName());
		}else
		{
			double price = this.CampaignCalculator(this.item, this.campaign);
			System.out.println("Item "+item.getName()+" sold by "+price+" with campaign of "+this.campaign.getName()+" to "+this.gamer.getFullName());
		}
	}
	
	public double CampaignCalculator(Item item,Campaign campaign) {
		return item.getPrice()-(item.getPrice()*campaign.getAmountOfDiscount())/100;
	}

}
