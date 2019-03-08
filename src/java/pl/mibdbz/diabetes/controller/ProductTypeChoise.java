
package pl.mibdbz.diabetes.controller;

import pl.mibdbz.diabetes.entity.Product;
import pl.mibdbz.diabetes.entity.ProductType;


public class ProductTypeChoise {
    
    private ProductType type = new ProductType();
    
    ProductType whichType(Product theProduct) {
        
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
            type.setName("inne");
            type.setShortName("NA");
            theProduct.setProductType(type);
            return theProduct.getProductType();
        }
    }
}
