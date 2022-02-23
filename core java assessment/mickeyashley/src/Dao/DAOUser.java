package Dao;
Scanner sc = new Scanner(System.in);

		out.println("Please enter your username :");
		String username = sc.next();
		out.println("Please enter your password :");
		String password = sc.next();

		UserService userService = new UserServiceImpl();
try {
	User user = userService.getUser();
	if(user != null){
		System.out.println("Hello "+user.getUsername());
	}
}catch(Exception e){
	System.out.println(e.printStackTrace());
}