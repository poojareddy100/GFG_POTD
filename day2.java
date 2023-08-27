class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
        // I will use two pointer
        // In java strings are immutable so we need to convert string to
        //character and return value of that character array
        char arr[]=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}
