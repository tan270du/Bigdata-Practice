package com.zuipin.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CollectionUtils {
	public static final String[]	EMPTY_STRING_ARRAY	= new String[0];
	
	private final static Log		log					= LogFactory.getLog(CollectionUtils.class);
	
	public static <T> List<T> findAll(List<T> items, Matcher<T> matcher) {
		List<T> results = new ArrayList<T>();
		for (T item : items) {
			if (matcher.match(item))
				results.add(item);
		}
		return results;
	}
	
	public static Boolean listNotNull(List list) {
		if (list != null && list.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static <T> T findFirst(List<T> items, Matcher<T> matcher) {
		for (T item : items) {
			if (matcher.match(item))
				return item;
		}
		return null;
	}
	
	public static <T> boolean allMatch(Collection<T> collection, Matcher<T> matcher) {
		for (T item : collection) {
			if (!matcher.match(item))
				return false;
		}
		return true;
	}
	
	public static <T> boolean has(Collection<T> collection, Matcher<T> matcher) {
		for (T item : collection) {
			if (matcher.match(item))
				return true;
		}
		return false;
	}
	
	public static <T> List<T> makeList(T... objects) {
		return Arrays.asList(objects);
	}
	
	public static <T> T[] makeArray(T... objects) {
		return objects;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] toArray(List<T> objects) {
		return (T[]) objects.toArray();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] toArray(List<T> objects, Class<T> clazz) {
		return objects.toArray((T[]) Array.newInstance(clazz, objects.size()));
	}
	
	public static <T> void addAll(Collection<T> collection, T[] array) {
		collection.addAll(Arrays.asList(array));
	}
	
	public static boolean contains(Object[] items, Object expected) {
		for (Object item : items) {
			if (BeanUtils.equals(item, expected))
				return true;
		}
		return false;
	}
	
	public static boolean equal(Object[] array1, Object[] array2) {
		if (array1 == null) {
			return array2 == null;
		}
		if (array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++) {
			if (!array1[i].equals(array2[i]))
				return false;
		}
		return true;
	}
	
	public static int indexOf(String[] strings, String s) {
		for (int i = 0; i < strings.length; i++) {
			if (StringUtils.equals(strings[i], s))
				return i;
		}
		return -1;
	}
	
	public static <T> boolean isEmpty(Collection<T> items) {
		return items == null || items.isEmpty();
	}
	
	public static <T> boolean isNotEmpty(Collection<T> items) {
		return !isEmpty(items);
	}
	
	public static List<String> split(String text, String delimiterValue) {
		List<String> resultItems = new ArrayList<String>();
		if (StringUtils.isEmpty(text))
			return resultItems;
		String[] originalItems = text.split(Pattern.quote(delimiterValue));
		for (String value : originalItems) {
			if (StringUtils.hasText(value))
				resultItems.add(value.trim());
		}
		return resultItems;
	}
	
	public static List<Integer> splitAsInt(String text, String delimiterValue) {
		List<String> strings = split(text, delimiterValue);
		List<Integer> integers = new ArrayList<Integer>();
		for (String string : strings) {
			try {
				integers.add(Integer.parseInt(string));
			} catch (NumberFormatException e) {
				// ignore
				log.error(e);
			}
		}
		return integers;
	}
	
	public static List<Long> splitAsLong(String text, String delimiterValue) {
		List<String> strings = split(text, delimiterValue);
		List<Long> integers = new ArrayList<Long>();
		for (String string : strings) {
			try {
				integers.add(Long.parseLong(string));
			} catch (NumberFormatException e) {
				// ignore
				log.error(e);
			}
		}
		return integers;
	}
	
	public static <T> String toDelimitedString(Collection<T> items, KeyPropertyGetter<T> getter, String delimiterValue) {
		if (CollectionUtils.isEmpty(items))
			return "";
		StringBuilder builder = new StringBuilder();
		for (T item : items) {
			builder.append(getter.get(item)).append(delimiterValue);
		}
		return builder.substring(0, builder.lastIndexOf(delimiterValue));
	}
	
	public static <T> String toDelimitedString(Collection<T> items, String delimiterValue) {
		if (CollectionUtils.isEmpty(items))
			return "";
		StringBuilder builder = new StringBuilder();
		for (Object item : items) {
			builder.append(item).append(delimiterValue);
		}
		return builder.substring(0, builder.lastIndexOf(delimiterValue));
	}
	
	/**
	 * 把List转换为以delimiterValue分隔符分隔的字符�?
	 * 
	 * @param items
	 * @param delimiterValue
	 *            分隔�?
	 * @return
	 */
	public static <T> String toString(Collection<T> items, String delimiterValue) {
		return toDelimitedString(items, delimiterValue);
	}
	
	public static interface Matcher<T> {
		boolean match(T item);
	}
	
	public static interface KeyPropertyGetter<T> {
		Object get(T item);
	}
	
}
