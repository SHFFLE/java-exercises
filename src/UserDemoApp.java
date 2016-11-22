/**
 * main() method is all of our "procedural code"
 * "procedural code" is code that runs as a waterfall
 */

public class UserDemoApp {
    public static void main(String[] args) {

//        If human submits the "register new user" form on our web page
//        Or if human runs the command line application

        User user = new User();
        user.setUsername("SHFFLE");
        boolean userSavedSuccessfully = user.saveUser();
        if(userSavedSuccessfully){
            System.out.println("Welcome to Bleh");
            } else {
            System.err.println("There was a problem.");
        }

    }
}
