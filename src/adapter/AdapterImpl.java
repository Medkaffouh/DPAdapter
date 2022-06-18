package adapter;

import ancienne.AncienneImpl;

//il'y a deux façon d'utilisée l'ancienne implementation
// 1 => par heritage
// 2 => par composition
public class AdapterImpl extends AncienneImpl implements Standard{
    @Override
    public void operation(double nb1, double nb2) {
        double p=produit(nb1,nb2);
        afficher(p);
    }
}
