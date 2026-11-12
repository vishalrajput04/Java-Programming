
class ValidPalindrome {

    public static boolean isAlphaNum(char ch) {

        if (ch >= '0' && ch <= '9' ||
            (Character.toLowerCase(ch) >= 'a' &&
             Character.toLowerCase(ch) <= 'z')) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        int st = 0;
        int end = s.length() - 1;

        boolean isPalindrome = true;

        while (st < end) {

            if (!isAlphaNum(s.charAt(st))) {
                st++;
                continue;
            }

            if (!isAlphaNum(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(st)) !=
                Character.toLowerCase(s.charAt(end))) {

                isPalindrome = false;
                break;
            }

            st++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}