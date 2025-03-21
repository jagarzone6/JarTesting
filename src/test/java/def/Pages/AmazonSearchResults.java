package def.Pages;

/**
 * Created by jagarzone on 19/04/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResults {

    WebDriver webDriver_;

    public AmazonSearchResults(WebDriver webDriver){webDriver_=webDriver;}

    static String ID_IMAGE_LINK_AMAZONCHOISE = "result_1";
    static String TITLE_LINK_AMAZONCHOISE = "/s/ref=sr_1_1_hso_sc_smartcategory_1?rh=n%3A172541%2Ck%3AHeadphones&keywords=Headphones&ie=UTF8&qid=1461254562&sr=8-1-acs";

    WebElement Imagelinkcont;
    WebElement TitleLink;

    public WebElement getImagelinkcont(){

        Imagelinkcont = webDriver_.findElement(By.id(ID_IMAGE_LINK_AMAZONCHOISE));
        return Imagelinkcont;
    }
    public WebElement getTitleLink(){

        TitleLink = webDriver_.findElement(By.linkText(TITLE_LINK_AMAZONCHOISE));
        return TitleLink;
    }
    public void clickAtImage(){
        Imagelinkcont.click();
    }

}
