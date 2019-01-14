package com.pages;

import com.core.MobileActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends MobileActions {

    @AndroidBy(xpath = "")
    MobileElement username;

    public HomePage(){
        super();
        PageFactory.initElements(this.driver,HomePage.class);
    }

    public void Login(){
        click(username);

    }
}
