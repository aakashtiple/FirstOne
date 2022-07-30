package org.pafefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends SearchHotel {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="hotel_name_0")
	WebElement hotelname;
	
	@FindBy(name="location_0")
	WebElement locationname;
	
	@FindBy(name="rooms_0")
	WebElement numberofrooms;
	
	@FindBy(name="arr_date_0")
	WebElement arrivaldate;
	
	@FindBy(name="dep_date_0")
	WebElement departureDate;
	
	@FindBy(name="room_type_0")
	WebElement roomtype;
	
	@FindBy(name="price_night_0")
	WebElement pricepernight;
	
	@FindBy(name="total_price_0")
	WebElement totalprice;
	
	@FindBy(name="radiobutton_0")
	WebElement selectbutton;
	
	@FindBy(name="continue")
	WebElement continuebutton;
	
	public void selectHotelMethods() throws InterruptedException {
		System.out.println("Name of the Hotel     =" +hotelname.getAttribute("value"));
		System.out.println("Location of the Hotel =" +locationname.getAttribute("value"));
		System.out.println("Number of room        =" +numberofrooms.getAttribute("value"));
		System.out.println("Arrival date          =" +arrivaldate.getAttribute("value"));
		System.out.println("Departure Date        =" +departureDate.getAttribute("value"));
		System.out.println("Room Tyoe             =" +roomtype.getAttribute("value"));
		System.out.println("Price per night       =" +pricepernight.getAttribute("value"));
		System.out.println("Total price           =" +totalprice.getAttribute("value"));
		
		selectbutton.click();
		continuebutton.click();
		Thread.sleep(3000);
	}
	
}
