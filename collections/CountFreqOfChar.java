public class Solution{
  public static void main(String args[])
  {
    String input = "banana";
    Map<Character, Integer> freq = new HashMap<>();

    for(char c : input.toCharArray())
    {
      freq.put(c, freq.getOrDefault(c, 0)+1);
    } 
    System.out.println(freq);
  }

}
