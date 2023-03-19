static void printDups(String str)
  {
    Map<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if(count.containsKey(str.charAt(i)))
        count.put(str.charAt(i) , count.get(str.charAt(i))+1);
      else count.put(str.charAt(i),1);
      //increase the count of characters by 1
    }
 
    for (Map.Entry<Character,Integer> mapElement : count.entrySet()) {   //iterating through the unordered map
      if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
    }
  }



// cpp
void printDups(string str)
{
    unordered_map<char, int> count;
    for (int i = 0; i < str.length(); i++) {
        count[str[i]]++;  //increase the count of characters by 1
    }
  
    for (auto it : count) {   //iterating through the unordered map
        if (it.second > 1)   //if the count of characters is greater than 1 then duplicate found
            cout << it.first << ", count = " << it.second
                 << "\n";
    }
}
