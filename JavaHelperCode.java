JAVA HELPER:

Fill an Array with 0;
----------------------
Arrays.fill(<array>,<value>);

String to Char Array:
----------------------
str.toCharArray()

Initialize Map:
---------------
Map<String,List> map = new HashMap<String,List>();

Map values to Arraylist:
------------------------
new ArrayList(map.values())

Map get:
--------
map.getOrDefault(key,<defaultvalue>);

Map Initialize:
----------------
private Map<Character, String> letters = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");


Arrays to Set:
-----------------
Set<Character> set = new HashSet<>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));


HigherKey/LowerKey:
---------------------

TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
map.higherKey(key);
map.lowerKey(key);

