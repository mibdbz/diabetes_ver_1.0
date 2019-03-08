
package pl.mibdbz.diabetes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

        witchType(theProduct);
        
        productService.saveProduct(theProduct);
        
        return "redirect:/product/list";
    }
    
    private ProductType witchType(Product theProduct) {
        ProductType type = new ProductType();
        
        if(theProduct.getProductType().getName().equalsIgnoreCase("owoce")) {
            type.setName("owoce");
            type.setShortName("OWO");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();
            
        } else if (theProduct.getProductType().getName().equalsIgnoreCase("warzywa")) {
            type.setName("warzywa");
            type.setShortName("WAR");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();
            
        } else if (theProduct.getProductType().getName().equalsIgnoreCase("pieczywo")) {
            type.setName("pieczywo");
            type.setShortName("PIE");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();
            
        } else if (theProduct.getProductType().getName().equalsIgnoreCase("mięso")) {
            type.setName("mięso");
            type.setShortName("MIE");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("nabiał")) {
            type.setName("nabiał");
            type.setShortName("NAB");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("mąka")) {
            type.setName("mąka");
            type.setShortName("MIM");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("słodycze")) {
            type.setName("słodycze");
            type.setShortName("SLO");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("zboża")) {
            type.setName("zboża");
            type.setShortName("ZBO");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("mięso")) {
            type.setName("mięso");
            type.setShortName("MIE");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("nasiona")) {
            type.setName("nasiona");
            type.setShortName("NAS");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("kasze")) {
            type.setName("kasze");
            type.setShortName("KAS");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("mięso")) {
            type.setName("mięso");
            type.setShortName("MIE");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("ryby")) {
            type.setName("ryby");
            type.setShortName("RYB");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("tłuszcze")) {
            type.setName("tłuszcze");
            type.setShortName("TLU");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else if (theProduct.getProductType().getName().equalsIgnoreCase("produkty gotowe")) {
            type.setName("produkty gotowe");
            type.setShortName("PRG");
            theProduct.setProductType(type);
            
            return theProduct.getProductType();

        } else {
            type.setName(null);
            type.setShortName(null);
            theProduct.setProductType(type);
            return theProduct.getProductType();
        }
        
    }
 
}
