package serie_2_1;

import java.util.Comparator;

public class AnneePublicationComparator implements Comparator<Livre> {
    @Override
    public int compare(Livre o1, Livre o2) {
        return Integer.compare(o1.getAnneePublication(), o2.getAnneePublication());
    }
}
