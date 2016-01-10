package org.yazgel.regex.s2m.generator;

public enum GenerationType {
	HASH_MAP("HASH_MAP"), CLASS_FILE("CLASS_FILE"), DYNAMIC_CLASS("DYNAMIC_CLASS");

	private String value;

	private GenerationType(String value) {
		this.value = value;
	}

	public static GenerationType fromString(String value) {
		for (GenerationType gt : GenerationType.values()) {
			if (gt.getValue().equalsIgnoreCase(value)) {
				return gt;
			}
		}
		return null;
	}

	public String getValue() {
		return value;
	}
}
