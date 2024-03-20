
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author Evans
 * @version 3/19/24
 */

public class SkillBuilder6 {

    // replace this line with your constants

    public static String findTYPattern(String s) {
        boolean wordStored = false;
        boolean isFirstLetter = true;
        boolean isLastLetter = false;
        String T_Y = "";
        String[] letter = s.split("");
        String[] word = s.split(" ");
        int wordIndex = 0;
        for (int letterIndex = 0; letterIndex < letter.length; letterIndex++) {

            if (isFirstLetter && (letter[letterIndex].equals("T") || letter[letterIndex].equals("t"))) {
                T_Y += " " + word[wordIndex];
                isFirstLetter = false;
                wordStored = true;
            }
            if (letter[letterIndex].equals(" ") || letter[letterIndex].equals(".") || letter[letterIndex].equals(",") || letter[letterIndex].equals("!") || letter[letterIndex].equals("?")) {
                isLastLetter = true;
            }
            if (wordStored == false && isLastLetter && (letter[letterIndex - 1].equals("Y") || letter[letterIndex - 1].equals("y"))) {
                T_Y += word[wordIndex];
                wordStored = true;
            }
            if (letter[letterIndex].equals(" ")) {
                wordIndex++;
                isFirstLetter = true;
                wordStored = false;
            } else {
                isFirstLetter = false;
                isLastLetter = false;
            }
        }
        String newTY = "";
        String[] ans = T_Y.split("");
        String[] removedEnds = new String[ans.length - 1];
        if (ans[0].equals(" ")) {
            removedEnds = new String[ans.length - 1];
            for (int index = 0; index < ans.length - 1; index++) {
                removedEnds[index] = ans[index + 1];
            }
            for (int i = 0; i < removedEnds.length; i++) {
                newTY += removedEnds[i];
                ans = removedEnds;
            }
            if (ans[ans.length - 1].equals(".") || ans[ans.length - 1].equals(",") || ans[ans.length - 1].equals("!") || ans[ans.length - 1].equals("?")) {
                removedEnds = new String[ans.length - 1];
                newTY = "";
                for (int index = 0; index < ans.length - 1; index++) {
                    removedEnds[index] = ans[index];
                }
                for (int i = 0; i < removedEnds.length; i++) {
                    newTY += removedEnds[i];

                }
            }


        }
        if (!(removedEnds[removedEnds.length - 1].equals("Y") || removedEnds[removedEnds.length - 1].equals("y"))){
            newTY = "";
        }
        return newTY;
    }
}