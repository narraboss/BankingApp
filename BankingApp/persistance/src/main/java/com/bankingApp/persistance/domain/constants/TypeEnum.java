/**
 * 
 */
package com.bankingApp.persistance.domain.constants;

/**
 * @author basanth
 *
 */
public interface TypeEnum {
	String getValue();

	static <E extends TypeEnum> E fromString(String s, Class<E> clazz) {
		if (s == null) {
			return null;
		}
		for (E e : clazz.getEnumConstants()) {
			if (e.getValue().equalsIgnoreCase(s))
				return e;
		}
		throw new IllegalArgumentException(String.format("%s, %s", clazz.getSimpleName(), s));
	}
}