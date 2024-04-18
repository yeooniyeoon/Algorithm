class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        StringBuilder revStr = new StringBuilder(my_string.substring(s, e + 1));
        return String.valueOf(answer.replace(s, e + 1, String.valueOf(revStr.reverse())));
    }
}