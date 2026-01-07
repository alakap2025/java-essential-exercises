/*
 * Set = mathematical uniqueness, no order,  Output type: Set<Integer>
*Stream distinct() = uniqueness while keeping original order. Output type: List<Integer>
 *
 * If you need more classes, simply define them inline.
 */
public class RemoveDuplicates{
  public static void main(String args[])
  {
    List<Integer> nums = Arrays.asList(1,2,3,4,5,4,5);

    Set<Integer> unique = new HashSet<>(nums);
    System.out.println("Using set: " + unique);

    List<Integer> uniquestream = nums.stream().distinct().toList();
    System.out.println("Using Streams:" +uniquestream);
    

  }

}
