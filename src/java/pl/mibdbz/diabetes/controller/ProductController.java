
package pl.mibdbz.diabetes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mibdbz.diabetes.entity.Product;
import pl.mibdbz.diabetes.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/list")
    public String listProducts(Model theModel) {
        
        List<Product> theProducts = productService.getProducts();
        
        theModel.addAttribute("products", theProducts);
        
        System.out.println(theProducts);
        
        return "list-products";
    }
}
