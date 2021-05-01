public class User {

	private String firstName;
	private String lastName;
	String password;
	private String mail;
	private boolean isActive;
	public User() {
		
	}
	 public User(String firstName,String lastName,String password,String mail,boolean isActive) {
		
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.password=password;
		 this.mail=mail;
		 this.isActive = true;
	 }

	 public String getFirstName() {
		 return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName= firstName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName= lastName;
	 }
	 public String getpassword() {
		 return password;
	 }
	 public void setpassword(String password) {
		 this.password= password;
	 }
	 public String getmail() {
		 return mail;
	 }
	 public void setmail(String mail) {
		 this.mail= mail;
	 }
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean Login(String firstName, String password){
	    if(firstName.equals(this.firstName) && password.equals(this.password))
	        this.isActive = true;
	    else{
	        this.isActive = false;
	    }
	     return this.isActive;
	}
}

