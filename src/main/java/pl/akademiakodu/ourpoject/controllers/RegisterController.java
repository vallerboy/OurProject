package pl.akademiakodu.ourpoject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.ourpoject.models.UserModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Admin on 2017-09-01.
 */
@Controller
public class RegisterController {



    @RequestMapping(path="/register",method = RequestMethod.GET)
    public String form(Model datamodel){

        datamodel.addAttribute("message",new UserModel());

        return "register";

    }

    @RequestMapping(path = "/register",method = RequestMethod.POST)
    public String addCarPost(@ModelAttribute("car") UserModel model,Model data){
       // data.addAttribute("message","Dodales samochod " + model.toString());
        File plik= new File("file.txt");
        if(!plik.exists()){
            try {
                plik.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(plik);
            fileOutputStream.write(model.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "register";
    }


}
