package velo.ladealpha.fields.astronomy;

// TODO: Auto-generated Javadoc
/**
 * The Class SpaceObject.
 */
public class SpaceObject {
	
	/**
	 * Instantiates a new space object.
	 *
	 * @param mass the mass
	 */
	public SpaceObject(long mass) {
		super();
		this.mass = (long) (mass * Math.pow(10, 20));
	}

	/** The mass. */
	private long mass; // rel to 10^20
}
