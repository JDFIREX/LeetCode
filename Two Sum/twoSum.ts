function twoSum(nums: number[], target: number): number[] {
    for(let index = 0; index < nums.length; index++) {
        const sumIndex = nums.indexOf(target - nums[index])
        if(sumIndex >= 0 && sumIndex !== index){
            return [index, sumIndex];
        }
    }
};