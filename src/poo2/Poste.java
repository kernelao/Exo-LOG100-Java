package poo2;

/**
 * Énumération représentant les différents postes possibles d’un joueur dans une équipe.
 *
 * Un joueur peut occuper l’un des postes suivants :
 * <ul>
 *     <li>{@link #ATTAQUE} – Attaquant, position offensive</li>
 *     <li>{@link #MILIEU} – Milieu de terrain, rôle polyvalent</li>
 *     <li>{@link #DEFENSE} – Défenseur, position défensive</li>
 * </ul>
 *
 * Cette énumération est utilisée dans la classe {@link Joueur}.
 *
 * @author kernelao
 * @version 1.0
 */
public enum Poste {
    ATTAQUE,
    MILIEU,
    DEFENSE
}
