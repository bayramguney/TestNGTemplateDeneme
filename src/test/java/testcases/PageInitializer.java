package testcases;


import PageObjects.*;

public class PageInitializer {
    public static HomePage homePage;


    public static void initializePages() {
        homePage = new HomePage();

    }
}