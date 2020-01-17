package product;

public class User {
	    private String firstname;
		private String lastname;
		private String username;
		private String password;
		private String email;
		private String mobile;
		/*public User(String firstname, String lastname, String username, String password, String email, String mobile) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.username = username;
			this.password = password;
			this.email = email;
			this.mobile = mobile;
		}*/
		//getters are accessors
		//setter are mutators
		public User()
		{
			
		}
		
	    public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

	/*void display()

	{
		System.out.println("First Name\t"+firstname);
		System.out.println("Last Name\t"+lastname);
		System.out.println("user Name\t"+username);
		System.out.println("Password\t"+password);
		System.out.println("Email Id\t"+email);
		System.out.println("Mobile\t"+mobile);
		
	}*/
		
	    
	}


