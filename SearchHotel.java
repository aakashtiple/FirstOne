package org.pafefactory;

import java.util.List;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);;
	}
	int i=0;

	

	
	@FindBy(name="location")
	WebElement location;
	
	@FindBy(name="hotels")
	WebElement hotels;
	
	@FindBy(name="room_type")
	WebElement roomtype;
	
	@FindBy(name="room_nos")
	WebElement numberofrooms;
	
	@FindBy(name="datepick_in")
	WebElement checkindate;
	
	@FindBy(name="datepick_out")
	WebElement checkoutate;
	
	@FindBy(name="adult_room")
	WebElement adultsperroom;
	
	@FindBy(name="child_room")
	WebElement childrensperroom;
	
	@FindBy(name="Submit")
	WebElement searchbutton;
	
	@FindBy(id="location_span")
	WebElement locationerror;
	
	@FindBy(id="num_room_span")
	WebElement numberofroomserror;
	
	@FindBy(id="checkin_span")
	WebElement checkindateerror;
	
	@FindBy(id="checkout_span")
	WebElement checkoutdateerror;
	
	@FindBy(id="adults_room_span")
	WebElement adultsperroomerror;
	
	public void locationcheck(int v1) {
		s= new Select(location);
		s.selectByIndex(v1);
	}
	
	public void hotelCheck(int v2) {
		s= new Select(hotels);
		s.selectByIndex(v2);
	}
	
	public void roomType(int v3) {

		s= new Select(roomtype);
		s.selectByIndex(v3);
	}
	
	public void checkinCheck() {
		checkindate.sendKeys("v5");
		String checkingdate= checkindate.getAttribute("value");
	}
	
	public void checkOutCheck() {
		checkoutate.sendKeys("v6");
		String CheckOutDate= checkoutate.getAttribute("value");
	}
	
	public void adults(int v7) {
		s= new Select(adultsperroom);
		s.selectByIndex(v7);
	}
	
	public void childrens(int v8) {
		s= new Select(childrensperroom);
		s.selectByIndex(v8);
	}
	public void searchHotelMethods(int v1,int v2,int v3,int v4, String v5,String v6,int v7,int v8) {
		
		s= new Select(location);
		s.selectByIndex(v1);
		List<WebElement> locationlist=s.getOptions();
		int sizeoflocation= locationlist.size();
		String[] loc= new String[sizeoflocation];
		i=0;
		for (WebElement  a : locationlist) {
			loc[i]=a.getText();
			i++;
					}
		String locationname= loc[v1];
		
		s= new Select(hotels);
		s.selectByIndex(3);
		List<WebElement> hotelslist= s.getOptions();
		int sizeofhotels= hotelslist.size();
		String[] hotellist= new String[sizeofhotels];
		i=0;
		for (WebElement b : hotelslist) {
			hotellist[i]=b.getText();
		}
		String hotelname= hotellist[v2];
		
		s= new Select(roomtype);
		s.selectByIndex(v3);
		List<WebElement> roomtypelist= s.getOptions();
		int sizeofroomtype= hotelslist.size();
		String[] roomlist= new String[sizeofhotels];
		i=0;
		for (WebElement c : roomtypelist) {
			roomlist[i]=c.getText();
		}
		String roomtype= hotellist[v3];
		
		s= new Select(numberofrooms);
		s.selectByIndex(v4);
		List<WebElement> listofrooms= s.getOptions();
		int sizeoflistofrooms= listofrooms.size();
		String[] numberofroomlist= new String[sizeoflistofrooms];
		i=0;
		for (WebElement d : listofrooms) {
			numberofroomlist[i]=d.getText();
		}
		String roomcount= numberofroomlist[v4];
		
		checkindate.sendKeys("v5");
		String checkingdate= checkindate.getAttribute("value");
		
		checkoutate.sendKeys("v6");
		String CheckOutDate= checkoutate.getAttribute("value");
		
		s= new Select(adultsperroom);
		s.selectByIndex(v7);
		List<WebElement> adultperroom= s.getOptions();
		int sizeofadultoerroom= listofrooms.size();
		String[] adultperroomlist= new String[sizeoflistofrooms];
		i=0;
		for (WebElement e : adultperroom) {
			adultperroomlist[i]=e.getText();
		}
		String roomsizet= adultperroomlist[v7];
		
		s= new Select(childrensperroom);
		s.selectByIndex(v8);
		List<WebElement> childperroom= s.getOptions();
		int sizeofchildeperroom= listofrooms.size();
		String[] childperroomlist= new String[sizeoflistofrooms];
		i=0;
		for (WebElement f : childperroom) {
			childperroomlist[i]=f.getText();
		}
		String numberofchild= childperroomlist[v8];
		
		searchbutton.click();
		
		if (locationerror.isDisplayed()){
			System.out.println("Location error is displayed");
		}else {
			if(numberofroomserror.isDisplayed()) {
				System.out.println("Number of rooms error is dispaye");
			}else {
				if(checkindateerror.isDisplayed()) {
					System.out.println("Check in date error is displayed");
				}else {
					if(checkoutdateerror.isDisplayed()) {
						System.out.println("Checkout error is displayed");
					}else {
						if(adultsperroomerror.isDisplayed()) {
							System.out.println("Adults per room error is dispalyed");
						}
					}
				}
			}
		}
	}
		
		
		
		
		
	}

