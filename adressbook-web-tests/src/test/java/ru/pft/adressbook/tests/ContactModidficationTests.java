package ru.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.pft.adressbook.model.ContactData;

/**
 * Created by Солнышко on 03.04.2017.
 */
public class ContactModidficationTests extends TestBase {

  @Test
  public void testContactModidfication(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test_name" , "test_surename", null), false);
    app.getContactHelper().submitContctModification();
    app.getContactHelper().returnHomePage();
  }
}
