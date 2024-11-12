package placement.projectwithspringboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import placement.projectwithspringboot.Entity.UserData;
import placement.projectwithspringboot.Service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/placement")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String  saveDetails(@RequestBody UserData userData)
    {
        userService.saveDetails(userData) ;
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String LoginPage()
    {
        return "Login" ;
    }
    @GetMapping("/signup")
    public String signupPage()
    {
        return "signup" ;
    }

    @GetMapping("/finduser/{name}")
    public List<UserData> getDetailsByname (@PathVariable String name)
    {
        return userService.getUserDetailsByname(name) ;
    }
    @GetMapping("/findbymail/{email}")
    public Optional<UserData> getuserbyemail(@PathVariable String email)
    {
        return userService.getuserbyemail(email);

    }



}
