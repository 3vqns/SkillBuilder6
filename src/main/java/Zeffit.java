/**
 * The Zeffit is a character whose purpose is to attack Groks and eliminate them.
 * When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.
 * When they take a third hit, Zeffits turn red.  The fourth hit makes them explode in a fiery
 * death!
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class Zeffit
{
    private static final int MAX_HEALTH = 4;
    private static final int HIT_DAMAGE = 1;

    private static int health;

    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {
        health = 4;
    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        health -= HIT_DAMAGE;
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {
        return health == MAX_HEALTH;
    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {
        return health == MAX_HEALTH - HIT_DAMAGE;
    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {
        return health == MAX_HEALTH - (2 * HIT_DAMAGE);
    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {
        return health == MAX_HEALTH - (3 * HIT_DAMAGE);
    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {
        return health == MAX_HEALTH - (4 * HIT_DAMAGE);
    }
}

