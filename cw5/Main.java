package PGO_12c.cw5;

public class Main {
    public static void main(String[] args) {
        
        Water woda1 = new Water("Woda1", 1, 100, true);
        Water woda2 = new Water("Woda2", 1, 90, false);
        Alcohol alkohol1 = new Alcohol("Alkohol1", 2, 80, 30);
        Alcohol alkohol2 = new Alcohol("Alkohol2", 3, 30, 80);
        Ore ruda1 = new Ore("Ruda1", 15, 3, false);
        Ore ruda2 = new Ore("Ruda2", 8, 9, true);
        Crystal krysztal1 = new Crystal("Kryształ1", 75, 45, 12);
        Crystal krysztal2 = new Crystal("Kryształ2", 75, 45, -12);
        Flower kwiat = new Flower("Kwiat", -10, 10);
        Root korzen = new Root("Korzeń", 64, 25);

        Eliksir eliksir1 = new Eliksir("Harnaś");
        eliksir1.addIngredient(korzen);
        eliksir1.addIngredient(woda1);
        eliksir1.addIngredient(alkohol1);
        eliksir1.addIngredient(ruda1);
        eliksir1.addIngredient(krysztal1);
        eliksir1.addIngredient(kwiat);
        eliksir1.removeIngredient(korzen);
        eliksir1.setCatalyst(woda2);
        eliksir1.Create();
        System.out.println("Katalizator pierwszego eliksiru: " + eliksir1.getCatalyst().getName());
        System.out.println("Pierwszy eliksir oraz jego składniki: " + eliksir1.toString());
        System.out.println("Moc pierwszego eliksiru: " + eliksir1.getPower());

        Eliksir eliksir2 = new Eliksir("Dębowe mocne");
        eliksir2.addIngredient(kwiat);
        eliksir2.addIngredient(woda2);
        eliksir2.addIngredient(alkohol2);
        eliksir2.addIngredient(ruda2);
        eliksir2.addIngredient(krysztal2);
        eliksir2.addIngredient(korzen);
        eliksir2.setCatalyst(alkohol1);
        eliksir2.removeIngredient(kwiat);
        eliksir2.Create();
        System.out.println("Katalizator drugiego eliksiru: " + eliksir2.getCatalyst().getName());
        System.out.println("Drugi eliksir oraz jego składniki: " + eliksir2.toString());
        System.out.println("Moc drugiego eliksiru: " + eliksir2.getPower());
    }
}
