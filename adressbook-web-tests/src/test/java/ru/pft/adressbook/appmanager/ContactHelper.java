package ru.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.pft.adressbook.model.ContactData;

/**
 * Created by Солнышко on 03.04.2017.
 */
public class ContactHelper extends HelperBase {
public ContactHelper(WebDriver wd) {super(wd);}

public void initContactCreation() {click(By.linkText("add new"));}

public void fillContactForm(ContactData  contactData, boolean creation) {

  type(By.name("firstname"), contactData.getFirstname());
  type(By.name("lastname"), contactData.getSecondname());

  if (creation){
    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGruop());
  } else {
    Assert.assertFalse(isElementPresent(By.name("new_group")));
  }
}

  public void submitContactCreation() {click(By.name("submit"));}

public void returnHomePage() {click(By.linkText("home page"));}

public void initContactModification() {click(By.cssSelector("img[alt='Edit'"));}

public void submitContctModification(){click(By.name("update"));}

}