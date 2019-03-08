
package pl.mibdbz.diabetes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mibdbz.diabetes.entity.Product;
import pl.mibdbz.diabetes.entity.ProductType;
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
    
    
    @RequestMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        
        Product theProduct = new Product();
        
        theModel.addAttribute("product", theProduct);
        
        return "product-form";
    }
    
    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product theProduct) {

        ProductTypeChoise typeChoice = new ProductTypeChoise();
        
        ProductType type = typeChoice.whichType(theProduct);
        
        theProduct.setProductType(type);
        
        productService.saveProduct(theProduct);
        
        return "redirect:/product/list";
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("productId") int theId, Model theModel) {
        
        Product theProduct = productService.getProduct(theId);
        
        theModel.addAttribute("product", theProduct);
        
        return "product-form";
    }
        
    
 
}
