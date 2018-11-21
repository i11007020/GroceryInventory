package groceryInventory;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GroceryInventoryController {
    
    @RequestMapping("/")
    public String index() {
        return "安安安安";
    }
    
    @RequestMapping("/page1")
    public String page1() {
        return "Hello! This is Page1!";
    }
    
    @RequestMapping("/weather") 
    public String weather(){
    	return "今天天氣很好!";
    }
    
    @RequestMapping(value = "getGrocery", method = RequestMethod.GET)
    public String getGrocery(@RequestParam("userID") String userID)
    {
    	return GroceryInventory.getGrocery(userID);
    }
    
    @RequestMapping("/test") 
    void test(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException 
    {
    	RequestDispatcher view;
    	view = request.getRequestDispatcher("page.html");
		view.forward(request, response);
    }
    
    
    
}
