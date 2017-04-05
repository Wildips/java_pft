package ru.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.pft.adressbook.model.ContactData;

/**
 * Created by Солнышко on 03.04.2017.
 */
public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surenama", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnHomePage();
  }
}
