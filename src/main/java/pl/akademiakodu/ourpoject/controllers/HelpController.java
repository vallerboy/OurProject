package pl.akademiakodu.ourpoject.controllers;

public class HelpController {

    //check if user exist (parameter 'name' - will be checking)
    @RequestMapping(path = "/userexist{name}", method = RequestMethod.GET)
    @ResponseBody
    public String userExist(@PathVariable("name") String name){
        if(isUserExist(name)){
            return "<h2><center>Uzytkownik " + name + " istnieje </center></h2>";
        } else {
            return "<h2><center>Niestety nie mamy zapisanego uzytkownika " + name + " ... </center></h2>";
        }
    }


}