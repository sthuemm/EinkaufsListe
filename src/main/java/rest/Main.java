package rest;



import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.ejb.Stateful;
import javax.persistence.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Sebastian Thümmel on 12.07.2016.
 */
@Controller
@Stateful
@RequestMapping("/main")
public class Main {

    private final static Logger logger = Logger.getLogger(Main.class.getName());

    @Autowired
    private EntityManager em;


    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public ModelAndView printMessage() {
        logger.setLevel(Level.FINEST);
        System.out.println(em);

        User user = em.find(User.class,1);
        //User user = new User();

        //model.addAttribute("user",user);


        return new ModelAndView("index","user",user);

    }

}
