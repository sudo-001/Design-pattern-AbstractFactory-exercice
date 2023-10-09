// package PatternAbstractFactory_exercice.code;
// package PatternAbstractFactory.code;

public class ProduitFactory1 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA1();
    }
    
    public ProduitB getProduitB() {
        return new ProduitB1();
    }

    public ProduitC getProduitC() {
        return new ProduitC1();
    }
}
