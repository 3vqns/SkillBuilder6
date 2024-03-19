
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants
// first letter t and last letter y
    public static String findTYPattern(String s)
    {
        boolean isFirstLetter = true; //is true at the beginning of each sentence and while newS[index-1] is " "
        boolean isLastLetter = false; //is true while newS[index + 1] is " " or a punctuation mark
        boolean foundY = false; //is true while foundT is true and isLastLetter is true and newS[index] is "y" or "Y"
        boolean foundT = false; //is true while isFirstLetter is true and nweS[index] is "T" or "t"
        String finalS = "";
        String[] newS = s.split("");
        for (int index = 0; index < newS.length; index ++){
            if(newS[index].contains("T") ||  newS[index].contains("t") ){
                finalS += newS[index] + " ";
            }
        }
        return finalS;
    }
}
