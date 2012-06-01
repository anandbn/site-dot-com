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
    	session.put("chatter_key", key);
    	chatter();
    }
    
    public static void chatter(){
    	render();
    }
    
    public static void corsTest(){
    	render();
    }

}