package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateNewContactTests extends TestBase {

  @Test
  public void testCreateNewContact() {
    app.gotoContactCreationPage();
    app.fillNewContactForm(new ContactData("firstTest","lastTest","addressTest"));
    app.submitContactCreation();
    app.returnToHomePage();
  }
}
