package zoom;

import java.util.Arrays;

public class M {
    public static void main(String[] args) {

        System.out.println("--- Starting UI Automation testing for Etsy Website----");

        openBrowser("Chrome");



    }





    public static void openBrowser(String browser){        // chrome, firefox, edge, safari....
        System.out.println("Launching "+browser+" browser");
    }

    public static void navigateToUrl(String url){
        System.out.println("Navigating to "+url);
    }
    public static void searchForItem(String item){
        System.out.println("PASS: verify "+item+" exists");
        System.out.println("Click on that "+item);
    }

    public static String verifyItemIsDisplayed(){
        String result = "PASS";
        return result;
    }


    }



