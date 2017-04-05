package ru.pft.adressbook.model;

/**
 * Created by Солнышко on 03.04.2017.
 */
public class ContactData {

  private final String firstname;
  private final String secondname;
  private String group;

  public ContactData(String firstname, String secondname, String gruop){
    this.firstname = firstname;
    this.secondname = secondname;
    this.group = group;
  }

  public String getFirstname(){
    return firstname;
  }

  public String getSecondname() {
    return secondname;
  }

  public String getGroup() {
    return group;
  }
}
