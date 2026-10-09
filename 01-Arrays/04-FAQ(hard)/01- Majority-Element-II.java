class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
    ArrayList<Integer> a=new ArrayList<>();
    int n=nums.length;
    int ele1=0;
    int ele2=0;
    int count1=0;
    int count2=0;
    for(int i=0;i<n;i++)
    {
        if(count1==0&&nums[i]!=ele2)
        {
            ele1=nums[i];
            count1=1;
        }
        else if(count2==0&&nums[i]!=ele1)
        {
            ele2=nums[i];
            count2=1;
        }
        else if(ele1==nums[i])
        count1++;
        else if(ele2==nums[i])
        count2++;
        else
        {
        count1--;
        count2--;
        }
    }
    count1 = 0;
    count2 = 0;
    for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        if (count1 > n / 3) a.add(ele1);
        if (count2 > n / 3) a.add(ele2);

        Collections.sort(a);
        return a;
    }
}
    