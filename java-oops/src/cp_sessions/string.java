package cp_sessions;
// public class string {
//     public static void main(String[] args) {
// //        String str = "nitin";
// //
// //        int s = 0;
// //        int e = str.length() - 1;
// //        boolean isplain = true;
// //
// //        while (s <= e) {
// //            if (str.charAt(s) == str.charAt(e)) {
// //                isplain = false;
// //                break;
// //            }
// //
// //            s++;
// //            e--;
// //        }
// //
// //        System.out.println(isplain);

//         int[] fre = new int[26];

//         String string = "ahdbshfbwmfhsw";

//         for (int i = 0; i < string.length(); i++) {
//             char c = string.charAt(i);
//             int index = c - 'a';
//             fre[index] += 1;

//         }
//     }
public class string {
    public static void main(String[] args) {
        int[] fre = new int[26];

        String string = "ahdbshfbwmfhsw";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            int index = c - 'a';
            fre[index] += 1;
        }

        int maxIndex = getMaxFrequencyIndex(fre);
        System.out.println("Alphabet with maximum frequency: " + (char) (maxIndex + 'a'));
    }

    public static int getMaxFrequencyIndex(int[] frequencies) {
        int maxIndex = 0;
        for (int i = 1; i < frequencies.length; i++) {
            if (frequencies[i] > frequencies[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

