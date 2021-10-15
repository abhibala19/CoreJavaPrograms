package codeevaluation;

public class After4 {
	public static void main(String[] args) {
		int[] s = { 1, 4, 5, 4, 3, 4, 5 };
		int[] a = findAfter4(s);
		for (int d : a) {
			System.out.println(d);
		}
	}

	public static int[] findAfter4(int[] nums) {
		if (nums[nums.length - 1] == 4)
			return nums;
		int countFirst = 0, countSecond = 0, count = 0;
		int[] arr = new int[nums.length];
		boolean flag = false;
		for (int i = 0; i < nums.length ; i++) {
			if (nums[i] == 4) {
				countFirst = i;
				for (int j = i + 1; j < nums.length -1; j++) {
					if (nums[j] == 4) {
						flag = true;
						countSecond = j;
					}
				}
					if (flag) {
						for (int k = countSecond + 1; k < nums.length - 1; k++)

							arr[count++] = nums[k];
					} else
						for (int k = countFirst + 1; k < nums.length ; k++)

							arr[count++] = nums[k];

				}
			
			}
		int[] nr=new int[count];
		for(int i=0;i<count;i++)
		{
			nr[i]=arr[i];
		}
		return nr;

  

			}
	}

