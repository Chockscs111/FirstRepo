package Pages;

import java.awt.List;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.server.handler.GetElementDisplayed;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{

@FindBy(xpath = "//a[@title= 'Women']")
private WebElement Wtitle ;

public WebElement getWtitle() {
return Wtitle;
}

@FindBy(xpath ="//span[text() = 'Women']")
private WebElement Tops;

public WebElement getTops() {
return Tops;
}

@FindBy(xpath = "//div/ul/li[2]/a[@title= 'Dresses']")
private WebElement Dtitle ;

public WebElement getDtitle() {
return Dtitle;
}

@FindBy(xpath = "//h5/a[text() =  'Casual Dresses']")
private WebElement CDress;

public WebElement getCDress() {
return CDress;
}


@FindBy(xpath = "//div/ul/li[3]/a[text()='T-shirts']")
private WebElement Ttitle ;


public WebElement getTtitle() {
return Ttitle;

}

@FindBy(xpath = "//p[text() = 'Catalog']")
private WebElement Catalog;

public WebElement getCatalog() {
return Catalog;

}

@FindBy(xpath = "//label/a[text() = 'S']")
private WebElement SmallSize;

public WebElement getSmallsize() {
return SmallSize;
}

@FindBy(xpath = "//label/a[text() = 'M']")
private WebElement MedSize;

public WebElement getMedsize() {
return MedSize;
}

@FindBy(xpath = "//label/a[text() = 'L']")
private WebElement LarSize;

public WebElement getLarsize() {
return LarSize;
}

@FindBys(@FindBy(xpath = "//*[@class = 'product_img_link']"))
private java.util.List<WebElement> prdcnt;

public int getprdcnt() {
return prdcnt.size();
}

@FindBy(xpath = "//span[@class = 'heading-counter']")
private WebElement Tsize;

public int getTsize() {
String a = Tsize.getText();
String [] n = a.split(" ");
int S = Integer.parseInt(n[2]);
return S;
}




public  HomePageObjects () {
PageFactory.initElements(driver, this);

}



}
