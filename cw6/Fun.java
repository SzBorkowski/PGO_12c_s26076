package PGO_12c.cw6;

import java.util.ArrayList;
import java.util.Collections;

public interface Fun {

    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        if (a >= b) {
            throw new RuntimeException("A has to be lower than B.");
        }
            ArrayList<Double> wartosciFunkcji = new ArrayList<>();
            while (a <= b) {
                wartosciFunkcji.add(func.f(a));
                a += alpha;
            }
        double najmniejszaWartosc = Collections.min(wartosciFunkcji);
        return najmniejszaWartosc;
    }
}
