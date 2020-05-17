package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePageObjects;

public class HomePageTest {

HomePageObjects hp;

public HomePageTest() {
// TODO Auto-generated constructor stub

hp = new HomePageObjects();

}

@Test
public void VerifyTab() {

Assert.assertTrue(hp.getWtitle().getText().contains("WOMEN"), "Passed");
Assert.assertTrue(hp.getDtitle().getText().contains("DRESSES"), "Passed");
Assert.assertTrue(hp.getTtitle().getText().contains("T-SHIRT"), "Passed");
}

@Test
public void WomenTab() {

hp.getWtitle().click();
//hp.getTops().click();
Assert.assertTrue(hp.getTops().getText().contains("Women"), "Passed");

}
@Test
public void Dresstab() {
hp.getDtitle().click();
//System.out.println("1st condition Passed");
//hp.getCDress().isDisplayed();
Assert.assertTrue(hp.getCDress().getText().contains("CASUAL"), "Passed");
//System.out.println("2nd condition Passed")

Assert.assertFalse(hp.getCDress().getText().contains("casual"), "Passed");
//System.out.println("3rd condition Passed");
}

@Test
public void TshCheck() {
hp.getTtitle().click();
Assert.assertTrue(hp.getCatalog().getText().contains("CATALOG"), "Passed");
//System.out.println("4th condition Passed");
}

@Test
public void SizeCheck() {
Assert.assertTrue(hp.getSmallsize().getText().contains("S"), "Success");
Assert.assertTrue(hp.getMedsize().getText().contains("M"), "Success");
Assert.assertTrue(hp.getLarsize().getText().contains("L"), "Success");

}

@Test
public void verifyCount() {
Assert.assertTrue(hp.getprdcnt() == hp.getTsize());

}



}

