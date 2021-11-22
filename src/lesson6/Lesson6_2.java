//package lesson6;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class Lesson6_2 {
//
//	public static void main(String[] args) {
//
//		Map<String, String> map = new HashMap<>();
//
//		String key = "key";
//
//		map.put(key, "value1");
//
////		System.out.println(key.hashCode());
////		System.out.println(map.get(key));
//
//		Map<String, Example> objectMap = new HashMap<>();
//		Example ex = new Example(123, "1234");
//		Example ex2 = new Example(123, "432");
//		objectMap.put("ex", ex);
//		final String ex21 = "ex2";
//		System.out.println("hash of string ex2 = " + ex21.hashCode());
//		objectMap.put(ex21, ex2);
//		System.out.println("hash before changing " + ex.hashCode());
//		System.out.println(objectMap.get(ex));
////		ex.i = 333;
//		System.out.println("hash after changing " + ex.hashCode());
//		System.out.println();
//		System.out.println();
//		System.out.println("example1 " + objectMap.get(ex));
//		System.out.println("example2 " + objectMap.get(ex21));
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println(1234 % 16);
//		System.out.println(1250 % 16);
//		int h = ex21.hashCode();
//
//
//	}
//
//// map.put("str1", obj1)
//// map.put("str2", obj2)
//
//// "str1".hashCode = 1234
//// 1234 % 16 = 2
//
//// "str2".hashCode = 1250
//// 1250 % 16 = 2
//
//// 1234 == 1234?  ("str1".hashCode == "str111".hashCode)
//// "str1".equals("str111")
////	0  1  2  		3  	4  5  6  7  8  9  10 11 12 13 14 15
////	[] [] [obj1]	[] 	[] [] [] [] [] [] [] [] [] [] [] []
////  bucket - ведро
////	O(1)
////  O(log(n))
//	// integer
//
//	// obj1.hashCode() = 123
//	// obj2.hashCode() = 123
//
//	// коллизия
//
//	// obj1.equals(obj2) ?
//
//	//  3
//	// [new LinkedList<>().add(obj1)] -> obj2
//
//	//
//
//
//	static class Example {
//		int i;
//		String s;
//
//		Example(int i, String s) {
//			this.i = i;
//			this.s = s;
//		}
//
//		@Override
//		public int hashCode() {
////			int result = i + Integer.parseInt(s);
////			return result;
//			return 1;
//		}
//
//		@Override
//		public String toString() {
//			return "i: " + i + " s:" + s;
//		}
//
//		@Override
//		public boolean equals(Object o) {
//			boolean result = false;
//			if (o instanceof Example) {
//				Example obj = (Example) o;
//				result = this.i == obj.i;
//				result = this.s.equals(obj.s);
//			}
//			return result;
//		}
//	}
//
//	class MyMap {
//
//		Object[] buckets;
//
//		@Override
//		public int size() {
//			return 0;
//		}
//
//		@Override
//		public boolean isEmpty() {
//			return false;
//		}
//
//		@Override
//		public Object get(Object key) {
//			return null;
//		}
//
//		@Override
//		public Object put(Object key, Object value) {
//			return null;
//		}
//
//		@Override
//		public Object remove(Object key) {
//			return null;
//		}
//
//		@Override
//		public void putAll(Map m) {
//
//		}
//
//		@Override
//		public void clear() {
//
//		}
//
//		@Override
//		public Set keySet() {
//			return null;
//		}
//
//		@Override
//		public Collection values() {
//			return null;
//		}
//
//		@Override
//		public Set<Entry> entrySet() {
//			return null;
//		}
//	}
//
//}
