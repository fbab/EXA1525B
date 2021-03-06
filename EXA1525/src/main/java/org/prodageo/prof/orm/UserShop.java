package org.prodageo.prof.orm;


import com.j256.ormlite.field.DatabaseField;

/**
 * Join table which links users to their shops.
 * 
 * <p>
 * For more information about foreign objects, see the <a href="http://ormlite.com/docs/foreign" >online docs</a>
 * </p>
 */
public class UserShop {

	public final static String USER_ID_FIELD_NAME = "user_id";
	public final static String shop_ID_FIELD_NAME = "shop_id";

	/**
	 * This id is generated by the database and set on the object when it is passed to the create method. An id is
	 * needed in case we need to update or delete this object in the future.
	 */
	@DatabaseField(generatedId = true)
	int id;

	// This is a foreign object which just stores the id from the User object in this table.
	@DatabaseField(foreign = true, columnName = USER_ID_FIELD_NAME)
	User user;

	// This is a foreign object which just stores the id from the shop object in this table.
	@DatabaseField(foreign = true, columnName = shop_ID_FIELD_NAME)
	Shop shop;

	UserShop() {
		// for ormlite
	}

	public UserShop(User user, Shop shop) {
		this.user = user;
		this.shop = shop;
	}
}