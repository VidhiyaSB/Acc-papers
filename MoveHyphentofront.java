/* Implement the following functions.a

char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare */

SOLUTIONS :

class HelloWorld {
    public static void main(String[] args) {
        String str = "Hello--------wwhi------";
        String op ="";
        int count = 0;
        String ans = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!='-'){
              op+=str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                count++;
                ans+= str.charAt(i);
            }
        }
        
        System.out.print(ans + op);
    }
}
