package pl.akademiakodu.ourpoject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class HelpController {

//    check if user exist (parameter 'name' - will be checking)
//    @RequestMapping(path = "/userexist{name}", method = RequestMethod.GET)
//    @ResponseBody
//    public String userExist(@PathVariable("name") String name){
//        if(isUserExist(name)){
//            return "<h2><center>Uzytkownik " + name + " istnieje </center></h2>";
//        } else {
//            return "<h2><center>Niestety nie mamy zapisanego uzytkownika " + name + " ... </center></h2>";
//        }
//    }

    //method checking user exists?
    public static boolean isUserExist(String name){
    File fileUsers = new File("resources/file.txt");

    try {
        for (String line: Files.readAllLines(fileUsers.toPath())){
            String[] partLine = line.split(",");
            for (String s : partLine) {
                if (s.equals(name)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        return false;
    }

}



