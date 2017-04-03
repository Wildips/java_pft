package ru.pft.adressbook.model;

/**
 * Created by Солнышко on 03.04.2017.
 */
public class ContactData {

  private final String firstname;
  private final String secondname;
  private String gruop;

  public ContactData(String firstname, String secondname, String gruop){
    this.firstname = firstname;
    this.secondname = secondname;
    this.gruop = gruop;
  }

  public String getFirstname(){
    return firstname;
  }

  public String getSecondname() {
    return secondname;
  }

  public String getGruop() {
    return gruop;
  }
}
