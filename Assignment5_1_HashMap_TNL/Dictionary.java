import java.util.HashMap;
import java.util.Iterator;

public class Dictionary<K, V> {
	
	HashMap<K, V> map = new HashMap<K, V>();
	
	/**
	 * Adds a new entry to this dictionary. If the given search key already exists in the dictionary, replaces the corresponding value.
	 * @param key An object search key of the new entry.
	 * @param value An object associated with the search key.
	 * @return Either null if the new entry was added to the dictionary or the value that was associated with key if that value was replaced.
	 */
	public V add(K key, V value) {
		return map.put(key, value);
	}
	
	/**
	 * Removes a specific entry from this dictionary.
	 * @param key An object search key of the entry to be removed.
	 * @return Either the value that was associated with the search key or null if no such object exists.
	 */
	public V remove(K key) {
		return map.remove(key);
	}
	
	/**
	 * Retrieves from this dictionary the value associated with a given search key.
	 * @param key An object search key of the entry to be retrieved.
	 * @return Either the value that is associated with the search key or null if no such object exists.
	 */
	public V getValue(K key) {
		return map.get(key);
	}
	
	/**
	 * Sees whether a specific entry is in this dictionary.
	 * @param key An object search key of the desired entry.
	 * @return True if key is associated with an entry in the dictionary.
	 */
	public boolean contains(K key) {
		return map.containsKey(key);
	}
	
	
	/**
	 * Sees whether this dictionary is empty.
	 * @return  True if the dictionary is empty.
	 */
	public boolean isEmpty() {
		return map.isEmpty();
	}
	
	/**
	 * Gets the size of this dictionary.
	 * @return The number of entries (key-value pairs) currently in the dictionary.
	 */
	public int getSize() {
		return map.size();
	}
	
	/**
	 * Removes all entries from this dictionary.
	 */
	public void clear() {
		map.clear();
	}
	
	
	
	/** Print all keys for the dictionary
	 */
	public void getKeys(){
		Iterator<K> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
		}
	}
	
	/** Print all values for the dictionary
	 */
	public void getValues(){
		Iterator<V> valueIterator = map.values().iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
	}
	
	/** Print all keys and values for the dictionary
	 */
	public void printDictionary(){
		Iterator<K> keyIterator = map.keySet().iterator();
		Iterator<V> valueIterator = map.values().iterator();
		while (keyIterator.hasNext()) {
			System.out.println(keyIterator.next() + " - " + valueIterator.next());
		}
	}
}
