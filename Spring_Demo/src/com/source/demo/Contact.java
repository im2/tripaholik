package com.source.demo;

public class Contact {
    private String firstname;
    private String lastname;
    private String email;
    private String telephone;
     
    //.. getter and setter for all above fields.
    
    public String getfirstname() {
		return firstname;
	}
    public void setfirstname(String firstname) {
		this.firstname=firstname;
	}

    public String getlastname() {
		return lastname;
	}
    public void setlastname(String firstname) {
		this.firstname=lastname;
	}

    public String getemail() {
		return email;
	}
    public void setemail(String email) {
		this.email=email;
	}
    
    public String gettelephone() {
		return telephone;
	}
    public void settelephone(String telephone) {
		this.telephone=telephone;
	}
    
   /* public Contact(String f, String l, String e, String t)
    {
    	this.firstname=f;
    	this.lastname=l;
    	this.email=e;
    	this.telephone=t;
    }*/
     
}