package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void loginSuccess(String key){
    	response.setCookie("chatter_key", key, "site-dot-com.herokuapp.com", "/", 30*60*1000, true);
    	chatter();
    }
    
    public static void chatter(){
    	render();
    }

}