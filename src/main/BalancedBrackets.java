package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */

    // didn't realize until studio that empty strings or those with no brackets was true,
    // so this original method I refractored to return those instances as false

//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        if (str.contains("[") || str.contains("]")) {
//            if (str.indexOf("[") < str.indexOf("]")) {
//                for (char ch : str.toCharArray()) {
//                    if (ch == '[') {
//                        brackets++;
//                    } else if (ch == ']') {
//                        brackets--;
//                    }
//                }
//            } else {
//                brackets = -1;
//            }
//        } else {
//            brackets = -1;
//        }
//        return brackets == 0;
//    }

    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets --;
            }
            if (brackets < 0) {
                return false;
            }
        }
        return brackets == 0;
    }
}



