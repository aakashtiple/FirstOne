package org.adactin;

import org.openqa.selenium.support.ui.Select;
import org.pafefactory.LoginPage;
import org.pafefactory.SearchHotel;
import org.pafefactory.SelectHotel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
		
	
	
	@BeforeMethod
	public void launch() {
		launchBrower();
	}
		
		@BeforeMethod
	public void login1() {
			LoginPage lp= new LoginPage();
			lp.loginPageMethods("aakashtiple","AdactinHotel");
		}
		
//		@Test
//		public void login2() {
//				LoginPage lp= new LoginPage();
//				lp.loginPageMethods("aakashtiple","adactinhotel");
//			}
//		@Test
//		public void login3() {
//				LoginPage lp= new LoginPage();
//				lp.loginPageMethods("Aakastiple","AdactinHotel");
//			}
//		@Test
//		public void login4() {
//				LoginPage lp= new LoginPage();
//				lp.loginPageMethods("aAkashtiple","AdactInHotel");
//			}
//		@Test
//		public void locationSelection1() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(1);
//			
//		}
//		@Test
//		public void locationSelection2() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(2);
//			
//		}
//		@Test
//		public void locationSelection3() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(3);
//			
//		}
//		@Test
//		public void locationSelection4() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(4);
//			
//		}
//		@Test
//		public void locationSelection5() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(5);
//			
//		}
//		@Test
//		public void locationSelection6() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(6);
//			
//		}
//		@Test
//		public void locationSelection7() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(7);
//			
//		}
//		@Test
//		public void locationSelection8() {
//			SearchHotel Sh= new SearchHotel();
//			Sh.locationcheck(8);
//			
//		}
		
//		@Test
//		public void hotelSelectionCheck1() {
//			SearchHotel SH2= new SearchHotel();
//			SH2.hotelCheck(1);
//		}
//		
//		@Test
//		public void hotelSelectionCheck2() {
//			SearchHotel SH2= new SearchHotel();
//			SH2.hotelCheck(2);
//		}
//		@Test
//		public void hotelSelectionCheck3() {
//			SearchHotel SH2= new SearchHotel();
//			SH2.hotelCheck(3);
//		}
//		@Test
//		public void hotelSelectionCheck4() {
//			SearchHotel SH2= new SearchHotel();
//			SH2.hotelCheck(4);
//		}
		
//		@Test
//		public void roomTypeCheck1() {
//			SearchHotel SH3= new SearchHotel();
//			SH3.roomType(1);
//			
//		}
//		
//		public void roomTypeCheck2() {
//			SearchHotel SH3= new SearchHotel();
//			SH3.roomType(2);
//			
//		}
//		
//		public void roomTypeCheck3() {
//			SearchHotel SH3= new SearchHotel();
//			SH3.roomType(3);
//			
//		}
//		
//		public void roomTypeCheck4() {
//			SearchHotel SH3= new SearchHotel();
//			SH3.roomType(4);
//			
//		}
//		
//		@Test
//		public void checkInDateCheck() {
//			SearchHotel SH4= new SearchHotel();
//			SH4.checkinCheck();
//		}
		

//		@Test
//		public void checkOutDate() {
//			SearchHotel SH5= new SearchHotel();
//			SH5.checkOutCheck();
//		}
		
//		@Test 
//		public void adultsPerRoom1() {
//			SearchHotel SH6= new SearchHotel();
//			SH6.adults(1);
//		}
//		@Test 
//		public void adultsPerRoom2() {
//			SearchHotel SH6= new SearchHotel();
//			SH6.adults(2);
//		}
//		@Test 
//		public void adultsPerRoom3() {
//			SearchHotel SH6= new SearchHotel();
//			SH6.adults(3);
//		}
//		@Test 
//		public void adultsPerRoom4() {
//			SearchHotel SH6= new SearchHotel();
//			SH6.adults(4);
//		}
		
//		@Test 
//		public void childrenPerRoom0() {
//			SearchHotel SH7= new SearchHotel();
//			SH7.childrens(0);
//		}
//		@Test 
//		public void childrenPerRoom1() {
//			SearchHotel SH7= new SearchHotel();
//			SH7.equals(1);
//		}
//
//		@Test 
//		public void childrenPerRoom2() {
//			SearchHotel SH7= new SearchHotel();
//			SH7.childrens(2);
//		}
//
//		@Test 
//		public void childrenPerRoom3() {
//			SearchHotel SH7= new SearchHotel();
//			SH7.childrens(3);
//		}
//		@Test 
//		public void childrenPerRoom4() {
//			SearchHotel SH7= new SearchHotel();
//			SH7.childrens(4);
	//	}
		
		@BeforeMethod
		public void searchhotel() {
			SearchHotel sh= new SearchHotel();
			sh.searchHotelMethods(2, 2, 2, 3, "26/08/22", "28/08/22", 2, 3);
		}

		@Test
		public void selectHotel() throws InterruptedException {
			SelectHotel sl= new SelectHotel();
			sl.selectHotelMethods();
		}
		
		
		

	@AfterMethod
	public static void close() {
		closeBrowser();
	}
}
